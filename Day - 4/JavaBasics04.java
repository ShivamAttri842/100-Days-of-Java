import java.util.Scanner;

public class JavaBasics04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input income
        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();

        double tax;
        
        // Basic tax slabs for demonstration purposes
        if (income <= 250000) {
            tax = 0; 
        } else if (income <= 500000) {
            tax = 0.05 * (income - 250000);
        } else if (income <= 1000000) {
            tax = 0.05 * 250000 + 0.2 * (income - 500000);
        } else {
            tax = 0.05 * 250000 + 0.2 * 500000 + 0.3 * (income - 1000000);
        }

        System.out.println("Your calculated tax is: ₹" + tax);

        scanner.close();
    }
}
