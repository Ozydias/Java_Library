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
public class LoginFrame {
    private JFrame jFrame;
    private JPanel jPanel;
    private JTextField jTextField;
    private JPasswordField jPasswordField;
    private JButton loginButton;

    public void ReaderLogin(){
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
                        if(s[i].equals(jTextField.getText())){
                            count = i;
                        }
                    }
                    if(!s[count].equals(jTextField.getText())){
                        JOptionPane.showMessageDialog(null,"读者不存在！","警告",JOptionPane.WARNING_MESSAGE);
                    }else if(!list.get(count).getLastName().equals(jPasswordField.getText())){
                        JOptionPane.showMessageDialog(null,"读者不存在！","警告",JOptionPane.WARNING_MESSAGE);
                    }else {
                        //TODO 进入借还书界面

                    }

                }catch (SQLException error){
                    error.printStackTrace();

                }
            }
        });
    }

}
