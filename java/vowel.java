package SCANNER;
import java.util.Scanner;
public class vowel {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The character '" + ch + "' is a Vowel.");
        } else {
            System.out.println("The character '" + ch + "' is not a vowel.");
        }
        sc.close();
    }
}