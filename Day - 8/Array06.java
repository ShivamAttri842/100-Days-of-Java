public class Array06 {
    public static void main(String[] args) {
        // Declare and initialize a string array
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        // Print the elements of the array
        System.out.println("Fruits in the array:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // Alternatively, using an enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
