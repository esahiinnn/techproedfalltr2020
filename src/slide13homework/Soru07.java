package slide13homework;

import java.util.Scanner;

public class Soru07 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir rakam alın ve bu rakam icin çarpım tablosunu ekrana yazdırın.
		  Kullanıcının hata yapmadığını farz edin.  
		  Ornegin kullanıcı 3 girerse; 
		  3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		 */

		
			Scanner scan = new Scanner(System.in);
			System.out.println("Bir rakam giriniz");
			int a = scan.nextInt();
			
			
			int i=1;
			while(i<=10) {
				System.out.println(a + "x"+ i + " = " + a*i);
				i++;
			}
			
			scan.close();
			
	}

}
