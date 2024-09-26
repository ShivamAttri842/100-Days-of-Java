public class Array07 {
    public static void main(String[] args) {
        String str = "Hello, I am Shivam Attri";
        char[] charArray = str.toCharArray();
        int vowelCount = 0;

        for (char c : charArray) {
            if (isVowel(c)) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
