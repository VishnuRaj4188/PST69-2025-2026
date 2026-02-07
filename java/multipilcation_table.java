package pdf;
import java.util.Scanner;
public class multipilcation_table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
        int a = sc.nextInt();
        for ( int i =1;i<=10;i++){
        	int result=a*i;
        	System.out.println(a+ "x" +i+ " = " + result);
        }
        sc.close();
       
        
	}
	

}
