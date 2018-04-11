import java.util.Random;

public class TablicaWstecz {

	public static void main(String[] args) {
		int[] tablica1 = new int[5];
		int[] tablica2 = new int[5];
		Random rnd = new Random ();	
		 
        for (int i = 0; i < tablica1.length; i++){
            tablica1[i] = rnd.nextInt(101)-50;
        }
        System.out.print("Tablica:"+"\r");
		for (int e:tablica1) {
			System.out.print(e+"\t");
		}
		
		System.out.println();
		for (int i = 0; i < tablica1.length; i++){
			tablica2[tablica2.length-1-i] = tablica1[i];
		}
		
		System.out.print("Tablica wstecz:"+"\r");
		for (int e:tablica2) {
			System.out.print(e+"\t");
		}
		
		

	}

}
