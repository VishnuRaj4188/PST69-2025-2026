public class Main {
    public static void main(String[] args) {
        String a  = "abacsggsaga";
        String reversed = "";
        for(int i = a.length() - 1; i >= 0; i--) {
            reversed = reversed + a.charAt(i);
        }
        System.out.println(reversed);
    }
}