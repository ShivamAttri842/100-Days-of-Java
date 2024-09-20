import java.util.Scanner;

public class JavaBasics06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd using ternary operator
        String result = (number % 2 == 0) ? "Even" : "Odd";

        // Print the result
        System.out.println(number + " is " + result);

        scanner.close();
    }
}
