package pdf;
import java.util.Scanner;
public class count_of_digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int count = 0;
        while (a!=0) {
        	a /= 10;
        	count++;
        }
        System.out.print("the count is :"+count);
        sc.close();
       
        }

}
