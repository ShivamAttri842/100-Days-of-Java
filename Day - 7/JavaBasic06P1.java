import java.util.Scanner;

public class JavaBasic06P1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            int a = sc.nextInt();
            System.out.print("Enter Number: ");
            int b = sc.nextInt();

            Swap(a, b);
        }
    }

    public static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = "+ b);
    }
}