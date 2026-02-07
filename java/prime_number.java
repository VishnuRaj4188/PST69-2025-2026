package pdf;
import java.util.Scanner;
public class prime_number {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int a = sc.nextInt();
			boolean isPrime = true;
			if (a <= 1) {
			    isPrime = false;
			} else {
			    for (int i = 2; i < 10; i++) {
			        if (a  % i == 0) {
			            isPrime = false;
			            break;
			        }
			    }
			}
			System.out.println(isPrime ? "Prime number" : "Not a Prime number");
			sc.close();
		}
    }
}
        


