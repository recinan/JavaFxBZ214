package edu.erciyes.database;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vispro","root","mysql1234");
        Statement statement = connection.createStatement();
        String sql = "select firstname, lastname from student where studentId = '1030510001'";
        ResultSet set = statement.executeQuery(sql);
        while (set.next()){
            System.out.println(set.getString(1) +" "+set.getString(2));
        }
    }
}
