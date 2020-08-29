package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;


public class TestConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        String url = "jdbc:postgresql://localhost:5432/first_lesson";
        String userName = "postgres";
        String pass = "1234567890";

        Class.forName("org.postgresql.Driver");

        try (Connection connection = DriverManager.getConnection(url, userName, pass)) {
            System.out.println("Connection Successful");
        }
        }
}
