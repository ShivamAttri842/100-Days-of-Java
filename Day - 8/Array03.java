import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the size of the array
        System.out.print("Enter the number of elements you want in the array: ");
        int size = scanner.nextInt();
        
        // Declare an array of the specified size
        int[] numbers = new int[size];
        
        // Take input from the user for each element of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Print the array elements along with their index
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Close the scanner
        scanner.close();
    }
}
