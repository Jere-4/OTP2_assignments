public class ShoppingCalculator {

    // Calculate cost of one item
    public static double calculateItemCost(double price, int quantity) {
        return price * quantity;
    }

    // Calculate total cost of a shopping cart
    public static double calculateTotalCost(double[] prices, int[] quantities) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i] * quantities[i];
        }
        return total;
    }
}
