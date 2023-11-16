import java.util.Scanner;

class HiArm {
    int n;


    HiArm() {
        n = 0;
    }


    HiArm(int a) {
        n = a;
    }

    int sumArm(int num) {
        int sum = 0;
        int temp = num;
        

        while (temp > 0) {
            int digit = temp % 10;
            sum += (digit * digit * digit);
            temp /= 10;
        }
        
        return sum;
    }

    void isArm() {
        int sum = sumArm(n);
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        HiArm armstrongChecker = new HiArm(number);
        
        armstrongChecker.isArm();
        input.close();
    }
}