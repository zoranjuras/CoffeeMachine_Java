package machine;
import java.util.Scanner;

public class CoffeeMachine {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Machine machine = new Machine(400, 540, 120, 9, 550);

        readInput();
    }

    public static void readInput() {
        String choice = "";
        while (choice != "exit") {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            choice = scanner.next();
            System.out.println();
            switch (choice) {
                case "buy" -> buy();
                case "fill" -> fill();
                case "take" -> Machine.take();
                case "remaining" -> Machine.showState();
                case "exit" -> System.exit(0);
                default -> System.out.println("Wrong input. Try again.");
            }
        }
    }

    private static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int addedWater = scanner.nextInt();
        Machine.totalWater += addedWater;
        System.out.println("Write how many ml of milk you want to add:");
        int addedMilk = scanner.nextInt();
        Machine.totalMilk += addedMilk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addedCoffeeBeans = scanner.nextInt();
        Machine.totalCoffeeBeans += addedCoffeeBeans;
        System.out.println("Write how many disposable cups you want to add:");
        int addedDisposableCups = scanner.nextInt();
        Machine.totalDisposableCups += addedDisposableCups;
        System.out.println();
        readInput();
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        // check if scanner.next() = "back"
        String input = scanner.next();
        int choice;
        if (input.equalsIgnoreCase("back")) {
            choice = 4;
        } else {
            choice = Integer.parseInt(input);
            switch (choice) {
                case 1, 2, 3 -> {
                    Machine.prepare(choice - 1);
                    break;
                }
                case 4 -> {
                    break;
                }
                default -> System.out.println("Wrong input. Try again.");
            }
        }
        System.out.println();
        readInput();
    }
}
