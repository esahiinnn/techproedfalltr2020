package day14whiledowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		/*
		 Kullanicidan isim ve soyismini alin.
		 Kullanicinin ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ekrana ayni satirda aralarina bosluk birakarak yaziniz.
		 */
		
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Ilk isminizi giriniz");
		char ilkHarf = scan.nextLine().toUpperCase().charAt(0);
		
		
		
		System.out.println("Soy isminizi giriniz");
		String soy = scan.nextLine().toUpperCase();
		
		
		char sonHarf = soy.charAt(soy.length()-1);
		if(ilkHarf<=sonHarf) {
			
			while(ilkHarf<=sonHarf) {
				System.out.print(ilkHarf + " ");
				ilkHarf++;
			}
			
		}else {
			
			while(sonHarf<=ilkHarf) {
				System.out.print(sonHarf + " ");
				sonHarf++;
			}		
		}
		scan.close();

			
			
			scan.close();
	}

}
