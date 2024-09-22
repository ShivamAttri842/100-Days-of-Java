import java.util.Scanner;

public class JavaBasics05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of n natural number");
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i<=n) {
            sum += i;
            i++;            
        }
        System.out.println("The Sum is: " + sum);
    }    
}
