import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BusPassDAO dao = new BusPassDAO();

        while (true) {
            System.out.println("\n--- Bus Pass System ---");
            System.out.println("1. Add Pass");
            System.out.println("2. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();

                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Route: ");
                    String route = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    System.out.print("Enter Validity (days): ");
                    int days = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Status (Active/Expired): ");
                    String status = sc.nextLine();

                    // Convert days → Date
                    Date validity = new Date(System.currentTimeMillis() + (days * 24L * 60 * 60 * 1000));

                    BusPass pass = new BusPass(0, userId, route, amount, validity, status);

                    if (dao.addBusPass(pass)) {
                        System.out.println("Bus Pass Added Successfully!");
                    } else {
                        System.out.println("Failed to add pass");
                    }
                    break;

                case 2:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}