package SCANNER;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String org = str.toUpperCase();
        String rev = "";
        for (int i = org.length() - 1; i >= 0; i--) {
            rev = rev + org.charAt(i);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < org.length(); i++) {
            if (org.charAt(i) != rev.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string \"" + str + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is NOT a Palindrome.");
        }
        sc.close();
    }
}
