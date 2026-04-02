import java.sql.Connection;
import java.sql.PreparedStatement;
public class BusPassDAO {
    public boolean addBusPass(BusPass pass) {
        boolean status = false;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO bus_pass(user_id, route, amount, validity, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, pass.getUserId());
            ps.setString(2, pass.getRoute());
            ps.setDouble(3, pass.getAmount());
            ps.setDate(4, new java.sql.Date(pass.getValidity().getTime()));
            ps.setString(5, pass.getStatus());

            status = ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
