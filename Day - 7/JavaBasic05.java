import java.util.Scanner;

public class JavaBasic05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number: ");
                int a = sc.nextInt();
            System.out.println("The factorial of "+a+" is : " + factorial(a));
        }
    }

    public static int factorial(int a) {
        int Factorial = 1;
        for (int i = 1; i <= a; i++) {
            Factorial = Factorial*i;
        }
        return Factorial;
    }
}
