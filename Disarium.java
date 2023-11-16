import java.util.Scanner;

public class Disarium {

    static int unit_power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base; // Fixed the calculation of power
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;

        // Calculate the number of digits in the input number
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        temp = num;
        int sum = 0;
        while (temp != 0) {
            int unit_digit = temp % 10;
            sum += unit_power(unit_digit, count);
            temp = temp / 10;
            count--;
        }

        System.out.println("Sum: " + sum);

        if (num == sum) {
            System.out.println(num + " is a Disarium number");
        } else {
            System.out.println(num + " is not a Disarium number");
        }
    }
}
