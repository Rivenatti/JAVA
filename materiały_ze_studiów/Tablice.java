import java.util.Random;
public class Tablice {

	public static void main(String[] args) {
		int[] tablica = new int[10];
		Random rnd = new Random ();	
		int suma = 0;
		 
        for (int i = 0; i < tablica.length; i++){
            tablica[i] = rnd.nextInt(101)-50;
            suma=suma+tablica[i];
        }
        System.out.println("Tablica:");
		for (int e:tablica) {
			System.out.print(e+"\t");
		}
		System.out.println("\n"+"Suma = "+suma);

}
}
