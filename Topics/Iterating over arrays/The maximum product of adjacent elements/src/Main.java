import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] myList = new int[size];
        int maxProduct = 0;

        for (int i = 0; i < size; i++) {
            myList[i] = scanner.nextInt();
        }

        for (int i = 1; i < size; i++) {
            if (myList[i] * myList[i - 1] > maxProduct) {
                maxProduct = myList[i] * myList[i - 1];
            }
        }

        System.out.println(maxProduct);
    }
}