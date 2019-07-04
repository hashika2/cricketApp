package com.connector;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnector implements Connector {


    public Connection connect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketapp", "root", "");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }



        }



