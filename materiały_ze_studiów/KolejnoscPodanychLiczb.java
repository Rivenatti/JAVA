import java.util.Scanner;

public class KolejnoscPodanychLiczb {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.println("Podaj a");
		int a = sc.nextInt();
		
		System.out.println("Podaj b");
		int b = sc.nextInt();
		
		System.out.println("Podaj c");
		int c = sc.nextInt();

		if(a>b){
			if(a>c){
				if(b>c)System.out.println("a>b>c");
				else System.out.println("a>c>b");
			}
			else System.out.println("c>a>b");
		}
		else{
			if(b>c)System.out.println("b>c>a");
			if(a>c){System.out.println("b>a>c");
			}
		else System.out.println("c>b>a");
	}
	}
}