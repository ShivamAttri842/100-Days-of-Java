public class Half_Pyramid_Pattern {
    public static void main(String[] args) {
        int n = 4;

        // Outer Loop
        for(int line = 1; line <= n; line++){
            // Inner Loop
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}