package machine;

public class Machine {

    static int totalWater;
    static int totalMilk;
    static int totalCoffeeBeans;
    static int totalDisposableCups;
    static int totalMoney;
    static CoffeeType[] coffeeTypes = new CoffeeType[3];

    public Machine(int totalWater, int totalMilk, int totalCoffeeBeans, int totalDisposableCups, int totalMoney) {
        this.totalWater = totalWater;
        this.totalMilk = totalMilk;
        this.totalCoffeeBeans = totalCoffeeBeans;
        this.totalDisposableCups = totalDisposableCups;
        Machine.totalMoney = totalMoney;

        coffeeTypes[0] = new CoffeeType(250, 0, 16, 4);
        coffeeTypes[1] = new CoffeeType(350, 75, 20, 7);
        coffeeTypes[2] = new CoffeeType(200, 100, 12, 6);
    }

    public static void take() {
        System.out.printf("I gave you $%d%n", totalMoney);
        totalMoney = 0;
        System.out.println();
    }

    public static void showState() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", totalWater);
        System.out.printf("%d ml of milk%n", totalMilk);
        System.out.printf("%d g of coffee beans%n", totalCoffeeBeans);
        System.out.printf("%d disposable cups%n", totalDisposableCups);
        System.out.printf("%d of money%n", totalMoney);
        System.out.println();
    }

    public static void prepare(int type) {

        CoffeeType coffee = coffeeTypes[type];
        int[] ingredients = coffee.getIngredientsAsArray();

        if (totalWater < ingredients[0]) System.out.println("Sorry, not enough water!");
        else if (totalMilk < ingredients[1]) System.out.println("Sorry, not enough milk!");
        else if (totalCoffeeBeans < ingredients[2]) System.out.println("Sorry, not enough coffee beans!");
        else if (totalDisposableCups < 1) System.out.println("Sorry, not enough disposable cups!");
        else {
            totalWater -= ingredients[0];
            totalMilk -= ingredients[1];
            totalCoffeeBeans -= ingredients[2];
            totalMoney += ingredients[3];
            totalDisposableCups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }
}

