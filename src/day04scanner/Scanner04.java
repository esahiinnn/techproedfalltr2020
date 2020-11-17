package day04scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) 
	{
		/*
		 Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini alip o dikdortgenin alan ve cevresini hesaplayip ekrana yazdiran programi olusturunuz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdortgenin uzun kenarini giriniz");
		int uzunkenar = scan.nextInt();
		System.out.println("Dikdortgenin kisa kenarini giriniz");
		int kisakenar = scan.nextInt();
		System.out.println("Alan = " + kisakenar*uzunkenar + " " + "Cevre = " + (uzunkenar+kisakenar)*2 );
		
		scan.close();
	
		
		
		

	}

}
