package pdf;

import java.util.Scanner;
public class perfect_number {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int sum=0;
        for (int i=1;i<a;i++) {
        	if(a%i==0) {
        		sum+=i;
        	}
        }
        if (sum==a) {
        	System.out.print(a   +"is a perfect number");
        }else {
        	System.out.print(a   +"is a not perfect number");
        }
        
	}
	

}
