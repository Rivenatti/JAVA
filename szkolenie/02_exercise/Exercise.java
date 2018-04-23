package szkolenie;

public class Exercise {

    public static void main(String[] args) {
        
        String custName = "John Smith";
        String itemDesc = "Lamp";
        
        String message;
        
        message = custName + " wants to buy a: " + itemDesc;
        System.out.println(message);
        
        
        System.out.println("-----");
        
        double price = 25.9;
        double tax = 4.9;
        int quantity = 8;
        double total;
        
        message = custName + " wants to buy a " + quantity + " " + itemDesc + "s";
        total = price * quantity * tax;
        System.out.println(message);
        System.out.println("Total cost with tax is: " + total);
    }
    
}
