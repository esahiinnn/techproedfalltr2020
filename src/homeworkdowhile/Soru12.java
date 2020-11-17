package homeworkdowhile;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {
		/*
		 do_while kullanarak bir oyun tasarlayın
		 */

		
				Scanner scan = new Scanner(System.in);
				System.out.println("Tahmin oyununa hosgeldiniz");
				int i = 0;
				
				do {
					System.out.println("Bir sayi giriniz");
					int s = scan.nextInt();
					i=s;
					if(i<30) {
						System.out.println("Tahmini buyultun");
					}else if(i>30) {
						System.out.println("Tahmini kucultun");
					}
					
					
					
				}while(i!=30);
				System.out.println("Tebrikler kazandiniz!");
				
				scan.close();	
	}

}
