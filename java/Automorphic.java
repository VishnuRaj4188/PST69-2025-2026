package pdf;
import java.util.Scanner;
public class Automorphic {
	public class perfect_number {
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number: ");
	        int num = sc.nextInt();
	        int temp = num;
	        int digitCount = 0;
	        while (temp > 0) {
	            digitCount++;
	            temp = temp / 10;
	        }
	        long square = (long) num * num;

	        long lastDigits = square % (long) Math.pow(10, digitCount);
	        System.out.println("Square of " + num + " is: " + square);
	        if (num == lastDigits) {
	            System.out.println(num + " is an Automorphic Number.");
	        } else {
	            System.out.println(num + " is NOT an Automorphic Number.");
	        }
	        sc.close();
	    }
	}}