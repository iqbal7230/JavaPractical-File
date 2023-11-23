import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

public class Q21{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (y == 0) {
                throw new ArithmeticException("/ by zero");
            }
            System.out.println((double) x / y);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}