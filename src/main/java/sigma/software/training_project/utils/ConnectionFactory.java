package sigma.software.training_project.utils;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
  public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
  public static final String USER = "postgres";
  public static final String PASS = "postgres";

  public static Connection getConnection() {
    try {
      Properties props = new Properties();
      props.setProperty("user",USER);
      props.setProperty("password",PASS);
      DriverManager.registerDriver(new Driver());
      return DriverManager.getConnection(URL, props);
    } catch (SQLException ex) {
      throw new RuntimeException("Error connecting to the database", ex);
    }
  }
}
