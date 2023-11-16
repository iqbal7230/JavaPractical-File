import java.util.Scanner;

public class Denomination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = input.nextInt();
        input.close();

        if (amount <= 0 || amount > 99999) {
            System.out.println("invalid input");
            return;
        }

        System.out.println("In words: " + WordRepresentation(amount));
        System.out.println("Denomination:");

        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        for (int denomination : denominations) {
            int count = amount / denomination;
            if (count > 0) {
                System.out.println(denomination + " X " + count + " = " + (denomination * count));
                amount %= denomination;
            }
        }
    }

    static String WordRepresentation(int amount) {
        String[] words = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        String result = "";

        while (amount > 0) {
            int digit = amount % 10;
            result = words[digit] + " " + result;
            amount /= 10;
        }

        return result.trim();
    }
}
