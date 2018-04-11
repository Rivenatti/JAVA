import java.util.Random;


public class LaczenieTablic {

	public static void main(String[] args) {
		int[] tablica1 = new int[5];
		int[] tablica2 = new int[5];
		int[] tablica3 = new int[10];
		Random rnd = new Random ();	
		 
        for (int i = 0; i < tablica1.length; i++){
            tablica1[i] = rnd.nextInt(101)-50;
            tablica2[i] = rnd.nextInt(101)-50;
        }
        System.out.println("tablica 1:");
		for (int e:tablica1) {
			System.out.print(e+"\t");
		}
		
		System.out.print("\r"+"tablica 2:"+"\r");
		
		for (int e:tablica2) {
			System.out.print(e+"\t");
		}
		
		for (int i = 0; i < tablica1.length; i++){
			tablica3[i]=tablica1[i];
        }
		for (int i = 0; i < tablica2.length; i++){
			tablica3[i+5]=tablica2[i];
        }
		System.out.print("\r"+"tablica 3:"+"\r");
		for (int e:tablica3) {
			System.out.print(e+"\t");
		}

	}

}