public class StringToWords {

    public static String[] splitIntoWords(String str) {
        return str.split("\\s+");
    }

    public static void main(String[] args) {
        String example1 = "hello world";
        String example2 = "this is a test";
        String example3 = "split   this   string";

        System.out.println(java.util.Arrays.toString(splitIntoWords(example1)));
        System.out.println(java.util.Arrays.toString(splitIntoWords(example2))); 
        System.out.println(java.util.Arrays.toString(splitIntoWords(example3)));
    }
}
