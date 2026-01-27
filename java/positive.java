import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int a = sc.nextInt();
        if (a<0){
            System.out.print("number is positive ");
        }else if (a>0){
            System.out.print("number is positive ");
        }else{
            System.out.print("number is 0 ");
        }
        
    }
}
