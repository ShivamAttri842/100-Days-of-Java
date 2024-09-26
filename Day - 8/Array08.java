public class Array08 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // Convert back to string
        String reversedStr = new String(charArray);
        System.out.println(reversedStr); // Output: !dlroW ,olleH
    }
}
