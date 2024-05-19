public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();

        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        return cleanedStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man a plan a canal Panama"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("racecar"));
    }
}