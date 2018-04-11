import java.util.Scanner;
public class lpierwsza {

	public static void main(String[] args) {
		int a;
		int i;
		int zmienna = 0;
		int pierwsza = 0;
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		for(i=1;i<=a;i++){
			if(a%i==0){
				zmienna++;
			}
		}
		if(zmienna<=2){
			pierwsza++;
			if(pierwsza<101){ System.out.println("Liczba jest liczba pierwsza");}
		}else{
			System.out.println("Liczba nie jest l pierwsza");
		}
		

	}

}
