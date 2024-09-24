import java.util.*;

public class JavaBasic02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number 1: ");
            int a = sc.nextInt();
            System.out.print("Enter number 2: ");
            int b = sc.nextInt();
            Sum(a, b);
        }
    }

    public static void Sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);        
    }
}
