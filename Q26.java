import java.util.Arrays;
import java.util.Scanner;

public class Q26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of sentences: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        String[] sentences = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the sentences: ");
            sentences[i] = scanner.nextLine();
        }

        for (int i = n - 1; i >= 0; i--) {
            String[] words = sentences[i].split(" ");
            StringBuilder output = new StringBuilder();

            for (String word : words) {
                word = word.replaceAll("[^a-zA-Z0-9\\s]", "");
                output.append(word).append(" ");
            }

            System.out.println(output.toString().trim());
        }
    }
}
