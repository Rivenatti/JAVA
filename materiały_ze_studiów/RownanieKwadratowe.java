import java.util.Scanner;

public class RownanieKwadratowe {

	int a,b,c;
	
	
	public RownanieKwadratowe(){
		System.out.println("Proszê podaæ parametry funkcji: ax^2 + bx + c");
		Scanner skaner = new Scanner(System.in);
		System.out.println("a = ");
		this.a = skaner.nextInt();
		System.out.println("b = ");
		this.b = skaner.nextInt();
		System.out.println("c = ");
		this.c = skaner.nextInt();
		System.out.println("\n");
	}
	
			public String rozwiazanie(){
				String rozwiazanie;
		
				int delta;
				delta = (b*b-4*a*c);
				System.out.println("Delta = " + delta);
				double PierwiastekzDelty;
				PierwiastekzDelty=Math.sqrt(delta);
				
				if(delta>0){
				double x1=(-b-PierwiastekzDelty)/(2*a);
				double x2=(-b+PierwiastekzDelty)/(2*a);
				rozwiazanie = ("Pierwiastki równania: " + "\n" + "x1 = " + x1 + "\n" + "x2 = " + x2);
				}else if(delta==0){
					int x=-b/(2*a);
					rozwiazanie = ("Pierwiastek równania: " + x);
				}else{
					rozwiazanie = ("Brak rozwi¹zañ rzeczywistych");
				}
			return rozwiazanie;	
			}
	
	
	public static void main(String[] args) {
		RownanieKwadratowe rownanie = new RownanieKwadratowe();
		System.out.println(rownanie.rozwiazanie());
	}

}
