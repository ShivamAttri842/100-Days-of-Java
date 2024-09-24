import java.util.Scanner;

public class JavaBasic01 {
    public static void main(String[] args) {
        Shivam();
    }

    /*
    Syntax of writing the function...
    returnType name_of_function(){
        body
        return statement;
    }
    */

    public static int Shivam(){
        System.out.print("Enter Number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.print(a);
        }
        return 0;
    }
}