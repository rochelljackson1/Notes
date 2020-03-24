public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public ItemToPurchase () {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    public ItemToPurchase(String name, int price, int quantity) {
        itemName = name;
        itemPrice = price;
        itemQuantity = quantity;
    }

    public String getName() {
        return itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void setName (String name) {
        itemName = name;
    }

    public void setPrice (int price) {
        itemPrice = price;
    }

    public void setQuantity (int quantity) {
        itemQuantity = quantity;
    }

}
