import java.util.Scanner;
public class SystemyLiczbowe {

	public static void main(String[] args) {
		
//		Liczba pobierana od u¿ytkownika w systemie 10:
		int a;
		System.out.println("Podaj liczbê w systemie decymalnym:");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
	
//		Wywo³ywanie funkcji:
		binarny(a);
		oktagonalny(a);
//		heksadecymalny(a);
	}

	public static void binarny(int a){
		
//		Deklaracja rozmiaru tablicy na podstawie iloœci wymaganych bitów do zapisu wczytanej liczby:
		int rozmiar=0;
		double x=2;
		double b=0;
		
//		Obliczanie potêgi 2 i sprawdzanie, czy jest mniejsza od wczytanej liczby:
		for(double i=0; b<=a; i++){
			b=Math.pow(x, i);
			rozmiar++;
		}
		rozmiar=rozmiar-1;  //w celu pozbycia siê 0 na najm³odszym bicie
		
//		Deklaracja tablicy:
		int [] tablica = new int [rozmiar];
		
//		Zamiana kodu 10 na binarny:
		for(int i=0; i<tablica.length; i++){
		if(a%2==0){
			tablica[tablica.length-1-i]=0;
			a=a/2;	
		}else{
			tablica[tablica.length-1-i]=1;
			a=a/2;
		}
		}
		
//		Wyœwietlenie wyniku:
		System.out.print("Kod binarny:"+"\r");
		for (int e:tablica) {
			System.out.print(e);
		}
	}
	
	public static void oktagonalny(int a){
//		Deklaracja rozmiaru tablicy na podstawie iloœci wymaganych bitów do zapisu wczytanej liczby:
		int rozmiar=0;
		double x=8;
		double b=0;
		
//		Obliczanie potêgi 8 i sprawdzanie, czy jest mniejsza od wczytanej liczby:
		for(double i=0; b<=a; i++){
			b=Math.pow(x, i);
			rozmiar++;
		}
		rozmiar=rozmiar-1;  //w celu pozbycia siê 0 na najm³odszym bicie
		
		
//		Deklaracja tablicy:
		int [] tablica = new int [rozmiar];
		
//		Zamiana kodu decymalnego na oktagonalny:
		for(int i=0; i<rozmiar; i++){
		if(a%8==0){
			tablica[tablica.length-1-i]=0;
			a=a/8;
		}
		if(a%8==1){
			tablica[tablica.length-1-i]=1;
			a=a/8;
		}
		if(a%8==2){
			tablica[tablica.length-1-i]=2;
			a=a/8;
		}
		if(a%8==3){
			tablica[tablica.length-1-i]=3;
			a=a/8;
		}
		if(a%8==4){
			tablica[tablica.length-1-i]=4;
			a=a/8;
		}
		if(a%8==5){
			tablica[tablica.length-1-i]=5;
			a=a/8;
		}
		if(a%8==6){
			tablica[tablica.length-1-i]=6;
			a=a/8;
		}
		if(a%8==7){
			tablica[tablica.length-1-i]=7;
			a=a/8;
		}
		}
		
//		Wyœwietlenie wyniku:
		System.out.print("\r"+"Kod oktagonalny:"+"\r");
		for (int e:tablica) {
			System.out.print(e);
		}
	}
	
	public static void heksadecymalny(int a){
		
//		Deklaracja rozmiaru tablicy na podstawie iloœci wymaganych bitów do zapisu wczytanej liczby:
		int rozmiar=0;
		double x=16;
		double b=0;
		
//		Obliczanie potêgi 16 i sprawdzanie, czy jest mniejsza od wczytanej liczby:
		for(double i=0; b<=a; i++){
			b=Math.pow(x, i);
			rozmiar++;
		}
		rozmiar=rozmiar-1;  //w celu pozbycia siê 0 na najm³odszym bicie
		
//		Deklaracja tablicy:
		int [] tablica = new int [rozmiar];
//		char[] Znaki = { 'A', 'B', 'C', 'D', 'E', 'F'};
		String TablicaZnakow[] = {"A", "B", "C", "D", "E", "F"};
		
//		Zamiana kodu decymalnego na heksadecymalny:
		for(int i=0; i<tablica.length; i++){
		if(a%8==0){
			tablica[tablica.length-1-i]=0;
			a=a/16;
		}
		if(a%8==1){
			tablica[tablica.length-1-i]=1;
			a=a/16;
		}
		if(a%8==2){
			tablica[tablica.length-1-i]=2;
			a=a/16;
		}
		if(a%8==3){
			tablica[tablica.length-1-i]=3;
			a=a/16;
		}
		if(a%8==4){
			tablica[tablica.length-1-i]=4;
			a=a/16;
		}
		if(a%8==5){
			tablica[tablica.length-1-i]=5;
			a=a/16;
		}
		if(a%8==6){
			tablica[tablica.length-1-i]=6;
			a=a/16;
		}
		if(a%8==7){
			tablica[tablica.length-1-i]=7;
			a=a/16;
		}
		if(a%8==8){
			tablica[tablica.length-1-i]=8;
			a=a/16;
		}
		if(a%8==9){
			tablica[tablica.length-1-i]=9;
			a=a/16;
		}
		if(a%8==10){
			TablicaZnakow[rozmiar-1-i]="A";
			a=a/16;
		}
		if(a%8==11){
			TablicaZnakow[rozmiar-1-i]="B";
			a=a/16;
		}
		if(a%8==12){
			TablicaZnakow[rozmiar-1-i]="C";
			a=a/16;
		}
		if(a%8==13){
			TablicaZnakow[rozmiar-1-i]="D";
			a=a/16;
		}
		if(a%8==14){
			TablicaZnakow[rozmiar-1-i]="E";
			a=a/16;
		}
		if(a%8==15){
			TablicaZnakow[rozmiar-1-i]="F";
			a=a/16;
		}
		}
		
//		Wyœwietlenie wyniku:
		System.out.print("\r"+"Kod heksadecymalny:"+"\r");
		for (int e:tablica){
			System.out.print(e);
		}
		for (String f:TablicaZnakow){
			System.out.print(f);
		}
	}
}
