import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    public static Connection getConnection() {
        String url = "jdbc:mysql://127.0.0.1:3306/buspass?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Alamelu@2506";
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
