import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seen.add(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("hello"));
        System.out.println(removeDuplicates("apple"));
        System.out.println(removeDuplicates("banana"));
        System.out.println(removeDuplicates("test"));
    }
}
