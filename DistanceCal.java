// The sum of two distances is calculated as:
// Distance 1 =	10 feets	24 inches
// Distance 2 =	 5 feets  	16 inches
// Sum of Distances=18feets	 4 inches

// A class Distance has the following members:
// Class Name		             :	Distance
// Data members		 :	f1,f2 (integer to store the feets value of 2 distances), inc1,inc2 (integers to store the inch value of 2 distances)

// Member methods
// Distance(int a,int b,int c,int d) - constructor to assign a to f1, b to inch1, c to f2, d to inc2
// void showDistance() - to display both the distances with suitable message
// void sumDistance()  - to find the sum of distances and print it.
import java.util.Scanner;
class Distance {
    int f1, f2, inc1, inc2;

    public Distance(int a, int b, int c, int d) {
        this.f1 = a;
        this.inc1 = b;
        this.f2 = c;
        this.inc2 = d;
    }

    public void showDistance() {
        System.out.println("Distance 1: " + f1 + " feet " + inc1 + " inches");
        System.out.println("Distance 2: " + f2 + " feet " + inc2 + " inches");
    }

    public void sumDistance() {
        int totalFeet = f1 + f2;
        int totalInches = inc1 + inc2;

        if (totalInches >= 12) {
            totalFeet += totalInches / 12;
            totalInches %= 12;
        }

        System.out.println("Sum of Distances: " + totalFeet + " feet " + totalInches + " inches");
    }
}

public class DistanceCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details for the first distance:");
        System.out.print("Feet: ");
        int f1 = sc.nextInt();
        System.out.print("Inches: ");
        int inc1 = sc.nextInt();

        System.out.println("Enter the details for the second distance:");
        System.out.print("Feet: ");
        int f2 = sc.nextInt();
        System.out.print("Inches: ");
        int inc2 = sc.nextInt();

        Distance distance = new Distance(f1, inc1, f2, inc2);
        distance.showDistance();
        distance.sumDistance();
    }
}

