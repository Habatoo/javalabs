package DB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        // Задаем параметры подключения
        String url = "jdbc:postgresql://localhost:5432/first_lesson";
        String userName = "postgres";
        String password = "1234567890";
        Class.forName("org.postgresql.Driver");

        try (Connection con = DriverManager.getConnection(url, userName, password);
             PreparedStatement pst = con.prepareStatement("SELECT * FROM Book");
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                System.out.print(rs.getInt(1));
                System.out.print(": ");
                System.out.print(rs.getString(2));
                System.out.print(", ");
                System.out.println(rs.getFloat(3) + "\t$");
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(Main.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}

