public class JavaBasics01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Addition Assignment
        System.out.println("Initial a = " + a);
        a += b;
        System.out.println("After a += b, a = " + a);

        a = 5;

        // Subtraction Assignment
        System.out.println("\nInitial a = " + a);
        a -= b;
        System.out.println("After a -= b, a = " + a);

        a = 5;

        // Multiplication Assignment
        System.out.println("\nInitial a = " + a);
        a *= b;
        System.out.println("After a *= b, a = " + a);

        a = 5;

        // Division Assignment
        System.out.println("\nInitial a = " + a);
        a /= b;
        System.out.println("After a /= b, a = " + a);
    }
}
