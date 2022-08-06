package com.learnhibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

    public static void main(String[] args) {

        String jdbcurl ="jdbc:mysql://localhost:3306/mydb?useSSL=false";
        String user ="root";
        String password ="codeisart";
        try {
            System.out.println("connecting to dtabase ..."+ jdbcurl);
            Connection myconn = DriverManager.getConnection(jdbcurl,user,password);
            System.out.println("connection sucessful");


        }
        catch (Exception exc){
            exc.printStackTrace();
        }
    }

}
