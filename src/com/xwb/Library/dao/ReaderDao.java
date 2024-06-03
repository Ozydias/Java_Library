package com.xwb.Library.dao;

import com.xwb.Library.entity.Reader;
import com.xwb.Library.utils.dbutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xwb
 */
public class ReaderDao {
    public List<Reader> QueryAllReader() throws SQLException {
        List<Reader> list = new ArrayList<>();
        //获取数据库连接
        Connection connection = dbutils.getConnection();
        PreparedStatement preparedStatement = dbutils.getConnection().prepareStatement("select  * from Reader");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            Integer ReaderID = resultSet.getInt("ReaderID");
            String FirstName = resultSet.getString("FirstName");
            String LastName = resultSet.getString("LastName");
            String Address = resultSet.getString("Address");
            String PhoneNumber = resultSet.getString("PhoneNumber");
            Integer Limits = resultSet.getInt("Limits");
            Reader reader = new Reader(ReaderID,FirstName,LastName,Address,PhoneNumber,Limits);
            list.add(reader);
        }
        return list;
    }

    public Reader QueryOneReader(String FirstName,String LastName) throws SQLException{
        Connection connection = dbutils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from Reader where FirstName = ? and LastName = ?");
        preparedStatement.setString(1,FirstName);
        preparedStatement.setString(2,LastName);
        ResultSet resultSet = preparedStatement.executeQuery();
        Integer readerID = resultSet.getInt("ReaderID");
        String firstName = resultSet.getString("FirstName");
        String lastName = resultSet.getString("LastName");
        String address = resultSet.getString("Address");
        String phoneNumber = resultSet.getString("PhoneNumber");
        Integer limits = resultSet.getInt("Limits");
        Reader reader = new Reader(readerID,firstName,lastName,address,phoneNumber,limits);
        return reader;
    }


}
