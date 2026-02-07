package pdf;
import java.util.Scanner;
public class simple_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal (p): ");
        int p = sc.nextInt();
        System.out.print("Enter the rate (r): ");
        int r = sc.nextInt();
        System.out.print("Enter the time (t): ");
        int t = sc.nextInt();
        double interest = (p * r * t) / 100.0;
        System.out.println("Simple Interest is: " + interest);
        sc.close();
    }
}
