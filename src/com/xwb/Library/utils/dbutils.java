package com.xwb.Library.utils;

import com.sun.source.tree.CatchTree;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * 数据库连接类
 * @author xwb
 */
public class dbutils {
    private static String driver,url,username,password;
    private static Connection connection;

    static{
        Properties properties = new Properties();
        InputStream ips = dbutils.class.getClassLoader().getResourceAsStream("library.properties");

        try {
            properties.load(ips);
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        try {
            //动态注册和加载jdbc类
            Class.forName(driver);
            System.out.println("数据库驱动加载成功");
        }catch (ClassNotFoundException e){
            System.out.println("数据库驱动加载失败");
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("数据库连接成功");
        }catch (SQLException e){
            System.out.println("数据连接失败");
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(Connection connection, Statement statement, ResultSet resultSet) throws SQLException{
        if(resultSet != null){
            try{
                resultSet.close();
            }catch (SQLException e){
                e.printStackTrace();
                throw e;
            }
        }
        if(statement != null){
            try {
                statement.close();
            }catch (SQLException e){
                e.printStackTrace();
                throw e;
            }
        }
        if(connection != null){
            try{
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
                throw e;
            }
        }
    }
    public static void main(String[] args) throws SQLException{
        getConnection();
    }
}
