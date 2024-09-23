import java.util.Scanner;

public class JavaBasics01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int a = sc.nextInt();
        System.out.println(a);
        sc.close();
    }
}
