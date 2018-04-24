package szkolenie;

public class ShoppingCart {
    
    public static void main(String[] args) {
       Item item1 = new Item();
       Item item2 = new Item();
       
       item1.descr = "Apple";
       item2.descr = "Pear";
       
       System.out.println("Product 1: " + item1.descr + "\nProduct 2: "+ item2.descr);
        
       item2 = item1;
       System.out.println(" -------");
       System.out.println("Product 1: " + item1.descr + "\nProduct 2: "+ item2.descr);
       
    }
}
