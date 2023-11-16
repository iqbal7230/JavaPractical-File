import java.util.Scanner;

public class evil {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int ans = 0;
        int pow = 1;
        int temp = num;
        while( temp != 0){
            int parity = temp % 2;
            ans = ans + (parity*pow);
            pow= pow*10;
            temp= temp/2;

        }
        int count=0;
        while(ans!=0){
            int lg =  ans%10;
            if ( lg == 1){
                count++;

            }
            ans = ans/10;
        }
        if (count %2 ==0){
            System.out.println(num +" is evil Number");
        }
        else{
            System.out.println(num +" is not Evil Number");
        }
        sc.close();
     }
}
