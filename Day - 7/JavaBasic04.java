import java.util.Scanner;

public class JavaBasic04 {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter n: ");
        int a = sc.nextInt();
        System.out.println("Enter r: ");
        int b = sc.nextInt();
        int Bino = factorial(a)/factorial(b)*factorial(a-b);
        System.out.println(Bino);
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

