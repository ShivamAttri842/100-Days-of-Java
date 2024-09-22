import java.util.Scanner;

public class JavaBasics02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        for (int i = sc.nextInt(); i >0 ; i/=10) {
            int LastDigit = i % 10;
            System.out.print(LastDigit);
        }
    }    
}
