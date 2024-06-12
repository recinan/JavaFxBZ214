package edu.erciyes.database;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.*;

public class FindGradeController {
    protected Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private CallableStatement callableStatement;
    protected TextField txtID = new TextField();
    protected TextField txtCourseID = new TextField();
    protected Button btnFind = new Button("Find Grade");
    protected Label lblStatus = new Label();

    protected void initializeDB(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vispro","root","mysql1234");
            //statement = connection.createStatement();
//            String query = "SELECT firstname, lastname, title, grade FROM student \n" +
//                    "INNER JOIN enrollment ON student.studentId = enrollment.studentId\n" +
//                    "INNER JOIN course ON enrollment.courseId = course.courseId\n" +
//                    "WHERE student.studentId = ? AND enrollment.courseId = ?";
//            preparedstatement = connection.prepareStatement(query);
            callableStatement = connection.prepareCall("CALL find_grade(?,?)");
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }

    protected void showGrade(){
//        String query = "SELECT firstname, lastname, title, grade FROM student \n" +
//                "INNER JOIN enrollment ON student.studentId = enrollment.studentId\n" +
//                "INNER JOIN course ON enrollment.courseId = course.courseId\n" +
//                "WHERE student.studentId = '"+txtID.getText()+"' AND enrollment.courseId = '"+txtCourseID.getText()+"'";
        ResultSet set;
        try {
            //ResultSet set = statement.executeQuery(query);
//            preparedStatement.setString(1,txtID.getText());
//            preparedStatement.setString(2,txtCourseID.getText());
//            set = preparedStatement.executeQuery();
            callableStatement.setString(1,txtID.getText());
            callableStatement.setString(2,txtCourseID.getText());
            set = callableStatement.executeQuery();
            while (set.next()){
                lblStatus.setText(set.getString(1)+" "+set.getString(2)+" "+set.getString(3)+" "+set.getString(4));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
