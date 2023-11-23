import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Q24{
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a file name as a command line argument.");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        try (FileInputStream fis = new FileInputStream(file)) {
            int counter = 0;
            int character;

            while ((character = fis.read()) != -1) {
                counter++;

                if (counter % 5 == 0) {
                    System.out.println((char) character);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}