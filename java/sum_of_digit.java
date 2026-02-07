package pdf;
import java.util.Scanner;
public class sum_of_digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int sum= 0;
        while (a!=0) {
            int b= a%10;
            sum+=b;
            a /=10;
        }
        System.out.print("sum of digits"+sum);
        sc.close();
	}

}
