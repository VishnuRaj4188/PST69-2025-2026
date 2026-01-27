import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter third integer: ");
        int c = sc.nextInt();
        int total = a + b + c;
        float average = total / 3;
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        sc.close();
    }
}
