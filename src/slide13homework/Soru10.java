package slide13homework;

import java.util.Scanner;

public class Soru10 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız.
		  Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		 */

		
		
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Bolenlerini gormek istediginiz sayiyi giriniz");
			int b = scan.nextInt();
			
			System.out.print(b +" 'nin bolenleri : ");
			int j =1;
			while(j<=b) {
				if(b%j==0) {
					System.out.print(j + " , ");
					
				}
				j++;
			}
			System.out.println();
			
			
			System.out.print(b + " 'nin bolenleri : ");
			for(int i=1; i<=b; i++) {
				if(b%i==0) {
					System.out.print(i + " , ");
				}
			}
			
			scan.close();
			
	}

}
