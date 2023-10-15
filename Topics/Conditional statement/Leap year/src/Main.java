import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int isLeap = scanner.nextInt();
        if (isLeap % 4 == 0 && isLeap % 100 != 0 || isLeap % 400 == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}
