package pdf;
import java.util.Scanner;
public class strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int originalNum = a;
        int sum = 0;
        while (a != 0) {
            int b= a % 10;
            int fact = 0;
			for (int i = 1; i <= b; i++) {
                fact *= i;
            }
            sum += fact;
            a /= 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is a strong number");
        } else {
            System.out.println(originalNum + " is not a strong number");
        }
        sc.close();
    }
}
