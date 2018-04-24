package szkolenie;

public class Exercise {

    public static void main(String[] args) {
       Item i1 = new Item();
       i1.ID = 12;
       i1.descr = "Carrot";
       i1.price = 3;
       i1.quantity = 8;
       System.out.println("ID: " + i1.ID + ", description: " + i1.descr + ", price: " + i1.price + ", quantity: " + i1.quantity +".");
    }
}
