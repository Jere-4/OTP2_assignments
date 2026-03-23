import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCartApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select language / Valitse kieli / Välj språk / 言語を選択:");
        System.out.println("1. English");
        System.out.println("2. Suomi (Finnish)");
        System.out.println("3. Svenska (Swedish)");
        System.out.println("4. 日本語 (Japanese)");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        Locale locale;

        switch (choice) {
            case 2:
                locale = new Locale("fi", "FI");
                break;
            case 3:
                locale = new Locale("sv", "SE");
                break;
            case 4:
                locale = new Locale("ja", "JP");
                break;
            case 1:
            default:
                locale = new Locale("en", "US");
        }

        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);

        System.out.print(messages.getString("enter_item_count") + " ");
        int itemCount = scanner.nextInt();

        double totalCost = 0;

        for (int i = 1; i <= itemCount; i++) {
            System.out.print(messages.getString("enter_price") + " " + i + ": ");
            double price = scanner.nextDouble();

            System.out.print(messages.getString("enter_quantity") + " " + i + ": ");
            int quantity = scanner.nextInt();

            totalCost += price * quantity;
        }

        System.out.println(messages.getString("total_cost") + " " + totalCost);
        scanner.close();
    }
}
