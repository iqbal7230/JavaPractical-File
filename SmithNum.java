import java.util.Scanner;

public class SmithNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        if (number < 4) {
            System.out.println("Output: NOT SMITH Number");
        } else {
            int originalNumber = number;
            int digitSum = 0;

            while (number > 0) {
                digitSum += number % 10;
                number /= 10;
            }

            int factorSum = 0;
            int i = 2;

            while (originalNumber > 1) {
                if (originalNumber % i == 0) {
                    factorSum += digitSumOf(i);
                    originalNumber /= i;
                } else {
                    i++;
                }
            }

            if (digitSum == factorSum) {
                System.out.println("Output: SMITH Number");
            } else {
                System.out.println("Output: NOT SMITH Number");
            }
        }
    }

    static int digitSumOf(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
