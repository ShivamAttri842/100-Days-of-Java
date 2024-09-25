import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Ask the user for the size of the array
        System.out.print("Enter the number of elements you want in the array: ");
        int size = scanner.nextInt();
        
        // Step 2: Declare an array of the specified size
        int[] numbers = new int[size];
        
        // Step 3: Take input from the user for each element of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Step 4: Ask the user for the index of the element they want to retrieve
        System.out.print("Enter the index of the element you want to retrieve (0 to " + (size - 1) + "): ");
        int index = scanner.nextInt();
        
        // Step 5: Validate the index and print the specific element
        if (index >= 0 && index < size) {
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } else {
            System.out.println("Invalid index. Please enter a value between 0 and " + (size - 1));
        }
        
        // Close the scanner
        scanner.close();
    }
}
