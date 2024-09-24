public class JavaBasic06P2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        Swap(a, b);
        
        System.out.println("a = " + a);
        System.out.println("b = "+ b);
    }

    public static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

