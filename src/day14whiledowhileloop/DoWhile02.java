package day14whiledowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan sayi aliniz.
		 Sayi 10'dan kucuk ise kazandiniz
		 Sayi 10 veya 10'dan buyuk ise sayi giriniz yazdirin.
		 */

		
		
			Scanner scan = new Scanner(System.in);
			
			
			int s = 0;
			
			
			do {
				System.out.println("Sayi giriniz");
				s = scan.nextInt();
			
			}while(s>=5);
			System.out.println("Kazandiniz");
			
		scan.close();
			
			
	}

}
