package SCANNER;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int Arr[] = new int[size];
        System.out.println("Enter the " + size + " elements:");
        for (int i = 0; i < size; i++) {
            Arr[i] = sc.nextInt();
        }
        System.out.println("The elements entered are:");
        for (int i = 0; i < size; i++) {
            System.out.print(Arr[i] + " ");
        }
        sc.close();
    }
}
