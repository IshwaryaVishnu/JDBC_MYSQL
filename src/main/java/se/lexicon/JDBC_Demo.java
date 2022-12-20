package se.lexicon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Demo {

    public static void main(String[] args) {

        try {
            //Define database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lecture_db","root","1246");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
