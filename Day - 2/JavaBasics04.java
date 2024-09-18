import java.util.Scanner;

public class JavaBasics04 {
    public static void main(String[] args) {
        // Area of Circle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = sc.nextInt();
        double area = 3.14f * radius * radius;

        System.out.println("The area of the circle is " + area);
    }
}