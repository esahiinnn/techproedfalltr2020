package homeworkdowhile;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya iki sayı girmesini söyleyin. 
		 Bu sayılar eşit ise ekrana “Kare oluşturdunuz” yazdırın. Eşit değilse tekrar iki sayı girmesini söyleyin.
		 */

		
			Scanner scan = new Scanner(System.in);
			
			int i = 0;
			int j = 0;
			
			do {
				System.out.println("Iki sayi giriniz");
				int s1 = scan.nextInt();
				int s2 = scan.nextInt();
				i = s1;
				j = s2;
				if(i==j) {
					System.out.println("Kare olusturdunuz");
				}
				
				
			}while(i!=j);
			scan.close();
	}

}
