package SCANNER;
import java.util. Scanner;
public class number_palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number:");
		int a = sc. nextInt();
		 int temp = a;
	        int rev = 0;
	        while (temp != 0) {
	            int digit = temp % 10;
	            rev = rev * 10 + digit;
	            temp = temp / 10;
	        }
	        if (a == rev) {
	            System.out.println("The number " + a + " is a Palindrome.");
	        } else {
	            System.out.println("The number " + a + " is NOT a Palindrome.");
	        }
	        sc.close();
	    }
	}