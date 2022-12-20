package se.lexicon;
import se.lexicon.model.Task;

import java.sql.*;

public class JDBC_Demo {

    public static void main(String[] args) {

        try {
            //Define database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lecture_db","root","1246");
            Statement statement = connection.createStatement();
            String selectAllTasks ="select * from tasks";

            // executeQuery() is used to execute SELECT query
             ResultSet resultSet = statement.executeQuery(selectAllTasks);
             while(resultSet.next()){
                 System.out.println();
                 int id = resultSet.getInt("id");
                 String title = resultSet.getString("title");
                 String desc = resultSet.getString("description");
                 int personId = resultSet.getInt("person_id");
                 Task task = new Task(id,title,desc);


                 String firstName = resultSet.getString("p.first_name");
                 String lastName = resultSet.getString("p.last_name");
                 Date regDate = resultSet.getDate("p.reg_date");
                 boolean active = resultSet.getBoolean("p._active");


             }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
