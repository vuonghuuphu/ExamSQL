package com.example.examnsc;


import com.example.examnsc.util.ConnectionHelper;

import java.sql.*;

public class UserModel {

    public static User Login(User obj) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        connection = ConnectionHelper.getConnection();
        User user = null;
        try {
            Statement statement = connection.createStatement();
            String sqlStatement = String.format("select * from user where username = '"+obj.getUser() +"' and password = " +obj.getPass());
            ResultSet rs = statement.executeQuery(sqlStatement);
            while (rs.next()){
                String name = rs.getString("username");
                String pass = rs.getString("password");
                user = new User(name, pass);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return user;
    }

}
