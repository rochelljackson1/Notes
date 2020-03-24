import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        int order1Subtotal = 0;
        int order2Subtotal = 0;
        int total = 0;

        Scanner scnr = new Scanner(System.in);
        ItemToPurchase order1 = new ItemToPurchase();
        ItemToPurchase order2 = new ItemToPurchase();

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        String itemName = scnr.nextLine();
        System.out.println("Enter the item price:");
        int itemPrice = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        int itemQuantity = scnr.nextInt();

        order1.setName(itemName);
        order1.setPrice(itemPrice);
        order1.setQuantity(itemQuantity);

        scnr.nextLine();
        System.out.println("");
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        String itemName2 = scnr.nextLine();
        System.out.println("Enter the item price:");
        int itemPrice2 = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        int itemQuantity2 = scnr.nextInt();

        order2.setName(itemName2);
        order2.setPrice(itemPrice2);
        order2.setQuantity(itemQuantity2);

        order1Subtotal = order1.getPrice() * order1.getQuantity();
        order2Subtotal = order2.getPrice() * order2.getQuantity();
        total = order1Subtotal + order2Subtotal;

        System.out.println("");
        System.out.println("TOTAL COST");
        System.out.println(order1.getName() + " " + order1.getQuantity() + " @ $" + order1.getPrice() + " = $" + order1Subtotal);
        System.out.println(order2.getName() + " " + order2.getQuantity() + " @ $" + order2.getPrice() + " = $" + order2Subtotal);
        System.out.println("");
        System.out.println("Total: $" + total);

    }
}

