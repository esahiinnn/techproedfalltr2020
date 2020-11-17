package day07ifelseifnestedif;

import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alinir
		 Eger tamsayi 0 dan kucuk ise ekrana "Negatif" yazdirin
		 0 ise ekrana "Notr" yazdirin
		 0 dan buyuk ise ekrana "Positif" Yazdirin
		 
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("sayi giriniz");
			double d = scan.nextDouble();
			if(d<0) {
				System.out.println("Negatif");
				
			}else if(d == 0) {
				System.out.println("Notr");
			}else if(d>0){
				System.out.println("Pozitif");
			}else {
				System.out.println("Sayi gir dedik ya mQ");
			}
			scan.close();
	}
	

}
