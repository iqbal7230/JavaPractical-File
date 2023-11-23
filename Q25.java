import java.util.Arrays;

public class Q25{
    public static void main(String[] args) {
        String a = "anagram";
        String b = "margana";

        System.out.println(isAnagram(a, b) ? "Anagrams" : "Not Anagrams");
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] charArrayA = a.toLowerCase().toCharArray();
        char[] charArrayB = b.toLowerCase().toCharArray();

        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        return Arrays.equals(charArrayA, charArrayB);
    }
}
