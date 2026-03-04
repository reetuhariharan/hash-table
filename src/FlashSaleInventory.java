import java.util.HashMap;

public class FlashSaleInventory {

    HashMap<String, Integer> inventory = new HashMap<>();

    // Add product with stock
    public void addProduct(String productId, int stock) {
        inventory.put(productId, stock);
    }

    // Check stock
    public int checkStock(String productId) {
        return inventory.getOrDefault(productId, 0);
    }

    // Purchase item
    public void purchaseItem(String productId) {

        if (!inventory.containsKey(productId)) {
            System.out.println("Product not found");
            return;
        }

        int stock = inventory.get(productId);

        if (stock > 0) {
            inventory.put(productId, stock - 1);
            System.out.println("Purchase successful. Remaining stock: " + (stock - 1));
        } else {
            System.out.println("Out of stock");
        }
    }
}