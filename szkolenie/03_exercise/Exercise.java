package szkolenie;

public class Exercise {

    public static void main(String[] args) {
        
        boolean outOfStock = false;
        int quantity = 8;
        String custName = "John Smith";
        String itemDesc = "Lamp";
        String message;
        double price = 25.9;
        double tax = 4.9;
        double total = price * quantity * tax;
        
        
        if(quantity > 1){
            message = custName + " wants to buy a: " + itemDesc + "s";
        }else{
            message = custName + " wants to buy a: " + itemDesc;
        }
        
        if(outOfStock){
            System.out.println("Item is currently unavailable.");
        }else{
            System.out.println("Item is currently available.");
            System.out.println("Total cost with tax is: " + total);
        }
        
        System.out.println("-----------");
        
       String array[] = {"Shirt", "Towel", "Chair", "Door"};
       
        message = custName + "wants to buy: " + array.length + " items.";
        System.out.println(message);
        System.out.println("The fourth item is: " + array[3]);
        
        System.out.println("-----------");
        
        
        message = "Items purchased: ";
        for(int i = 0; i < array.length; i++){
            message += array[i] + ", ";
        }
        
        System.out.println(message);
    }
    
}
