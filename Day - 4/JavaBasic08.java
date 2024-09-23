import java.util.Scanner;

public class JavaBasics08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Pizza - $10");
        System.out.println("2. Burger - $5");
        System.out.println("3. Pasta - $8");
        System.out.println("4. Salad - $6");

        System.out.print("Please select an item (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You ordered Pizza. The price is $10.");
                break;
            case 2:
                System.out.println("You ordered Burger. The price is $5.");
                break;
            case 3:
                System.out.println("You ordered Pasta. The price is $8.");
                break;
            case 4:
                System.out.println("You ordered Salad. The price is $6.");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid menu item.");
        }

        sc.close();
    }
}