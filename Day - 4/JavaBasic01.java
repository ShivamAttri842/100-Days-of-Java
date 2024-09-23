public class JavaBasics01 {
    public static void main(String[] args) {
        int number = 10;

        // If-else statement
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is not a positive number.");
        }

        // Else-if ladder
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}