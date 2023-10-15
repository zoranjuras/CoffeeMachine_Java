import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        boolean isSorted = true;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (i > 0) {
                if (array[i] < array[i - 1]) {
                     isSorted = false;
                    break;
                }
            }
        }
        System.out.println(isSorted);
    }
}