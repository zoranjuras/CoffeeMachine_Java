import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int limit = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > limit) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}