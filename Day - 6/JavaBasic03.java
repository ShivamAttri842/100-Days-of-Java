public class Print_Inverted_Star_Pattern {
    public static void main(String[] args) {
        int Line = 4;

        //Outer Loop
        for (int i = 1; i <= Line; i++) {
            // Inner Loop
            for (int j = 1; j <= Line-i+1; j++) {
                System.out.print("*");                
            }
            System.out.println();
        }
    }    
}
