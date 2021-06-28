package leonarduskevin.jwork.postgre;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Class untuk menghubungkan database Postgre ke dalam Project
 * @author Leonardus Kevin
 * @version 27.06.2021
 */
public class DatabaseConnectionPostgre {

    public static Connection connection() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jwork", "postgres", "Johnwayne123");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
