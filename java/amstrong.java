package pdf;
import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int originalNum = a;
        int sum = 0;
        int digits = String.valueOf(a).length();

        while (a != 0) {
            int digit = a % 10;
            sum += (int) Math.pow(digit, digits); 
            a /= 10;
        }
        if (sum == originalNum) {
            System.out.print(originalNum + " is an Armstrong number");
        } else {
            System.out.print(originalNum + " is not an Armstrong number");
        }
        sc.close();
    }
}
