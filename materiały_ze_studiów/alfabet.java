import java.util.Scanner;
public class alfabet {

	public static void main(String[] args) {
	
	System.out.println("Podaj literê alfabetu:");
		
	Scanner scan = new Scanner(System.in);
	String wczytaj = scan.nextLine();
	char c = wczytaj.charAt(0);
	
	
	
		for (int i=1; i<=3;i++){
			System.out.println((char)(c+i));
		}
	}

}
