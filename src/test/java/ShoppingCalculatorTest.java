import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShoppingCalculatorTest {

    @Test
    void testCalculateItemCost_basic() {
        double price = 10.0;
        int quantity = 2;
        double expected = 20.0;

        double result = ShoppingCalculator.calculateItemCost(price, quantity);

        assertEquals(expected, result, 0.0001);
    }

    @Test
    void testCalculateItemCost_withDecimals() {
        double price = 5.75;
        int quantity = 3;
        double expected = 17.25;

        double result = ShoppingCalculator.calculateItemCost(price, quantity);

        assertEquals(expected, result, 0.0001);
    }

    @Test
    void testCalculateItemCost_zeroQuantity() {
        double price = 12.99;
        int quantity = 0;
        double expected = 0.0;

        double result = ShoppingCalculator.calculateItemCost(price, quantity);

        assertEquals(expected, result, 0.0001);
    }

    @Test
    void testCalculateTotalCost_multipleItems() {
        double[] prices = {5.0, 10.0, 2.5};
        int[] quantities = {2, 1, 4};
        double expected = (5.0 * 2) + (10.0 * 1) + (2.5 * 4);

        double result = ShoppingCalculator.calculateTotalCost(prices, quantities);

        assertEquals(expected, result, 0.0001);
    }

    @Test
    void testCalculateTotalCost_emptyCart() {
        double[] prices = {};
        int[] quantities = {};
        double expected = 0.0;

        double result = ShoppingCalculator.calculateTotalCost(prices, quantities);

        assertEquals(expected, result, 0.0001);
    }

    @Test
    void testCalculateTotalCost_withDecimals() {
        double[] prices = {1.99, 3.49, 10.50};
        int[] quantities = {3, 2, 1};
        double expected = (1.99 * 3) + (3.49 * 2) + (10.50 * 1);

        double result = ShoppingCalculator.calculateTotalCost(prices, quantities);

        assertEquals(expected, result, 0.0001);
    }

    @Test
    void testCalculateTotalCost_mixedValues() {
        double[] prices = {0, 20.0, 7.25};
        int[] quantities = {5, 0, 2};
        double expected = (0 * 5) + (20.0 * 0) + (7.25 * 2);

        double result = ShoppingCalculator.calculateTotalCost(prices, quantities);

        assertEquals(expected, result, 0.0001);
    }
}
