package machine;

public class CoffeeType {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int price;

    public CoffeeType(int water, int milk, int coffeeBeans, int price) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.price = price;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Method to get an integer array of properties
    public int[] getIngredientsAsArray() {
        int[] ingredients = new int[4];
        ingredients[0] = water;
        ingredients[1] = milk;
        ingredients[2] = coffeeBeans;
        ingredients[3] = price;
        return ingredients;
    }
}
