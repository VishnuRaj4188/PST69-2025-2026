public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 33, 40, 55, 60};

        System.out.println("Even numbers in the array are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
