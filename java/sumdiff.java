import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int sum = a + b;
        int difference = a - b;
        double quotient = (double) a / b; 
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Quotient = " + quotient);
        sc.close();
    }
}
