package SCANNER;
import java.util.Scanner;
public class sum_of_arrayelements {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        int sum = 0;
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n ; i++) {
	            sum += arr [i];
	        }
	        System.out.println("Sum of array elements = " + sum);
	        sc.close();
	    }
	}


