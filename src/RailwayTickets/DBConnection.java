
package RailwayTickets;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;


public class DBConnection {

    public static Connection getDBConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mohsin", "root", "52247");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
