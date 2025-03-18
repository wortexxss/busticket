
import java.util.Scanner;

public class BusTicketCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in km: ");
        int km = sc.nextInt();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter the trip type: 1 => One-way, 2 => Round-trip ");
        int tripType = sc.nextInt();

        if (km > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            double ticketPrice = km * 0.10;
            double discountRate = 0.0;

            // Age discount calculation
            if (age < 12) {
                discountRate = 0.50;
            } else if (age >= 12 && age < 18) {
                discountRate = 0.10;
            } else if (age >= 60) {
                discountRate = 0.30;
            }

            double discountedPrice = ticketPrice - (ticketPrice * discountRate);

            if (tripType == 2) {
                discountedPrice = discountedPrice * 0.80 * 2;
            }

            System.out.println("Total Ticket Price: $" + discountedPrice);
        } else {
            System.out.println("Invalid input. Please enter valid values.");
        }
    }
}
