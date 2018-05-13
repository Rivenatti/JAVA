
package exercise_10;

public class Exercise_10 {

    public static void main(String[] args) {
        int x = 4, y = 9;
        
        x = ((x/y) < 3) ? (x+=y) :(x*=y);
        
        System.out.println(x);
        
    }
    
}
