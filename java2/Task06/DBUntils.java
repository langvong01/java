package ADF2.Task06;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUntils {
    private static  DBUntils instance;
    private Connection connection;
    private DBUntils(){
        Properties properties = new Properties();
        try {
            properties.load(DBUntils.class.getResourceAsStream("/dbConfig.properties"));
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String userName = properties.getProperty("userName");
        String password = properties.getProperty("password");
        Class.forName(driver);
        connection = DriverManager.getConnection(url,userName,password);
        }catch (ClassNotFoundException | SQLException | IOException e){
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }
    public static DBUntils getInstance() throws  SQLException{
        if (instance == null || instance.getConnection().isClosed()){
            instance = new DBUntils();
        }
        return  instance;
    }
}
/**
 * Get the connection from the instance
 * @return (@link Connection)
 */
