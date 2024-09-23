import java.util.Scanner;

public class JavaBasics07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check voting eligibility using ternary operator
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println(eligibility);

        scanner.close();
    }
}
