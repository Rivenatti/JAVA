
public class CiagFibonacciego {

	public static void main(String[] args) {
		int rozmiar = 10;
		int[] tablica = new int[rozmiar];
		int max=0;
		int i;
		
				
		 for(i = 0; i < tablica.length; i++){
	            if(i==0){
	            	tablica[i]=0;
	            }else if(i==1){
	            	tablica[i]=1;
	            }else{
	            	tablica[i]=tablica[i-1]+tablica[i-2];
	            }
	     	  }
		 for(i = 0; i < tablica.length;i++){
				if(tablica[i] > max){
					max = tablica[i];
				}
	        
			for (int e:tablica) {
				System.out.println(e);
				
			}
			System.out.println("Max = " + max);
			}
	}

}
