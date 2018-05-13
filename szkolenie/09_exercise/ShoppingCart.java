package szkolenie;

public class ShoppingCart {
    
    public static void main(String[] args) {
       Item item1 = new Item("Apple", 25, 15, 'r');
       System.out.println("Item price is: " + item1.getQuantity()+"\n");
       item1.displayItem();
    }
}
