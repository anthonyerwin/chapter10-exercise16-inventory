import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        try {
            itemList.add(item);
            displayItem(item);

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public void discontinueItem(Item item) {
        try {
            item.setItemName("Discontinued");
            item.setStockAmount(0);

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public void displayItem(Item item) {
        System.out.println();
        System.out.printf("%s%d%n", "Stock ID: ", item.getStockId());
        System.out.printf("%s%s%n", "Item Name: ", item.getItemName());
        System.out.printf("%s%d%n", "Stock Amount: ", item.getStockAmount());
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }
}
