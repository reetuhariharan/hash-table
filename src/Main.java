public class Main {

    public static void main(String[] args) {

        FlashSaleInventory sale = new FlashSaleInventory();

        sale.addProduct("IPHONE15", 5);

        sale.purchaseItem("IPHONE15");
        sale.purchaseItem("IPHONE15");

        System.out.println("Stock left: " + sale.checkStock("IPHONE15"));

    }
}