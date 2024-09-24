public class JavaBasic03 {
    public static void main(String[] args) {
        int prod = multiply(3, 5);
        System.out.println("a * b = "+prod);
    }
    
    public static int multiply(int a, int b) {
        int product = a*b;
        // taking return as product 
        return product;
    }
}
