package com.xwb.Library.gui;

import com.xwb.Library.dao.ReaderDao;
import com.xwb.Library.entity.Reader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

/**
 * @author xwb
 */
public class LoginFrame extends JFrame{
    private JPanel jPanel1,jPanel2,jPanel3;
    private JTextField jTextField1,jTextField2;
    private JLabel jLabel1,jLabel2;
    private JButton loginButton,exitButton;

    public void ReaderLogin(){
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();

        jLabel1 = new JLabel("FirstName:");
        jLabel2 = new JLabel("LastName:");

        loginButton = new JButton("登入");
        exitButton = new JButton("退出");

        ReaderDao readerDao = new ReaderDao();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    List<Reader> list = readerDao.QueryAllReader();
                    String []s = new String[list.size()];
                    int count = 0;

                    for(int i = 0; i< list.size(); i++){
                        s[i] = list.get(i).getFirstName();
                        if(s[i].equals(jTextField1.getText())){
                            count = i;
                        }
                    }
                    if(jTextField1.getText().trim().length() == 0 || new String (jTextField2.getText()).trim().length() == 0){
                        //trim()用于删除头尾的空白字符
                        JOptionPane.showMessageDialog(null,"FirstName and LastName 不能为空","警告",JOptionPane.PLAIN_MESSAGE);
                    }
                    if(!s[count].equals(jTextField1.getText())){
                        JOptionPane.showMessageDialog(null,"读者不存在！","警告",JOptionPane.WARNING_MESSAGE);
                    }else if(!list.get(count).getLastName().equals(jTextField2.getText())){
                        JOptionPane.showMessageDialog(null,"读者不存在！","警告",JOptionPane.WARNING_MESSAGE);
                    }else {
                        //TODO 进入借还书界面
                        System.out.println("登入成功");

                    }
                }catch (SQLException error){
                    error.printStackTrace();
                }
            }
        });
        exitButton.addActionListener(new ActionListener() {
            //设置监听
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //关闭窗口释放屏幕资源
            }
        });

        jTextField1 = new JTextField(10);
        jTextField2 = new JPasswordField(10);

        this.setLayout(new GridLayout(3,1));
        //采用网格布局三行一列

        //此JFrame加入三个JPanel
        this.add(jPanel1);
        this.add(jPanel2);
        this.add(jPanel3);

        //第一个JPanel加入JLabel和JTextField
        jPanel1.add(jLabel1);
        jPanel1.add(jTextField1);

        //第二个JPanel加入JLabel和JPasswordField
        jPanel2.add(jLabel2);
        jPanel2.add(jTextField2);

        //第三个JPanel加入两个JButton
        jPanel3.add(loginButton);
        jPanel3.add(exitButton);

        this.setTitle("登入界面");
        this.setSize(300,150);
       this.setLocationRelativeTo(null);
        //设置界面和虚拟机一起关闭
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置界面可显示
        this.setVisible(true);
    }

    public static void main(String[] args){
       LoginFrame loginFrame = new LoginFrame();
       loginFrame.ReaderLogin();
    }

}
