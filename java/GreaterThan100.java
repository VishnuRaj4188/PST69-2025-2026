
import java.util.Scanner;
public class GreaterThan100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        double num = sc.nextDouble();
        if (num > 100) {
            System.out.println("The number is greater than 100");
        } else {
            System.out.println("The number is not greater than 100");
        }
        sc.close();
    }
}