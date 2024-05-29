package edu.erciyes.FX;
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {

        try {
            //Loading Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establish Connection
            String databaseUrl = "jdbc:mysql://localhost:3306/vispro";
            Connection con = DriverManager.getConnection(databaseUrl,"root","mysql1234");
            //Create Statement
            Statement statement = con.createStatement();
            //Execute Statement
            String query = "SELECT firstname, lastname FROM vispro.student";
            ResultSet set = statement.executeQuery(query);
            //Process ResultSet
            while (set.next()){
                System.out.println(set.getString("firstname") + " " + set.getString("lastname"));
            }
            con.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch (SQLException e){
            e.printStackTrace();
        };

    }
}
