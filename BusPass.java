import java.util.Date;

public class BusPass {
    private int passId;
    private int userId;
    private String route;
    private double amount;
    private Date validity;
    private String status;

    public BusPass(int passId, int userId, String route, double amount, Date validity, String status) {
        this.passId = passId;
        this.userId = userId;
        this.route = route;
        this.amount = amount;
        this.validity = validity;
        this.status = status;
    }
    public int getPassId() {
        return passId;
    }

    public int getUserId() {
        return userId;
    }

    public String getRoute() {
        return route;
    }

    public double getAmount() {
        return amount;
    }

    public Date getValidity() {
        return validity;
    }

    public String getStatus() {
        return status;}
}