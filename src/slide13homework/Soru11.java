package slide13homework;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan uzunluğu çift sayı olan bir String alın ve bu String’in ilk yarısını ekrana yazdırın. 
		 Ornegin; Kullanıcı “Hollanda�? girerse ekrana “Holl�? yazdıracaksınız.
		 */

			Scanner scan=new Scanner(System.in);
			System.out.println("Uzunluğu cift sayi olan bir String giriniz");
			String s = scan.nextLine();
			int u = s.length()/2;
			
			for(int i =0; i<u; i++) {
				System.out.print(s.charAt(i));
			}
			
			System.out.println();
			
			
			int j = 0;
			while(j<u) {
				System.out.print(s.charAt(j));
				j++;
			}
			
			
scan.close();
			
	}

}
