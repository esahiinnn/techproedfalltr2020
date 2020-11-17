package day06ifstatement;

import java.util.Scanner;

public class swap01 {

	public static void main(String[] args) {
		/*
		 a Variable'inin degeri 12, b Variable'nin degeri 25 olsun.
		 Oyle bir kod yazinir ki a 25, b 12 olsun
		 Sayilari kullanicidan alin
		 
			*/
			//1.Yol Ucuncu bir variable kullandik
			
			 
			 
			Scanner scan = new Scanner(System.in);
			System.out.println("Iki sayi giriniz");
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			/*
			System.out.println("a : " + a );
			System.out.println("b : " + b );
			double temp = 0;
			temp = a;      //temp = 12  a = 12 b = 25
			a = b;            //temp = 12  a = 25 b = 25
			b = temp;      //temp  = 12 a = 25 b = 12
			System.out.println("a : " + a );
			System.out.println("b : " + b );
			*/
			
			
			//2.Yol ucuncu variable kullanma
			a = a + b; //a =37 b = 25
			b = a - b; //a = 37 b = 12
			a = a - b; //a = 25 b = 12
			System.out.println("a : " + a );
			System.out.println("b : " + b );
			scan.close();
			
			
			
	}

}
