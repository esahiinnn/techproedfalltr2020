package day24varargsaccessmodifiers;

import java.util.Scanner;

/*
			 1) Method parantezi icinde birden fazla parametre varsa, varargs her zaman en sonuncu 
		parametre olmadilir.
		
			 2) Method parantezi icinde 1'den fazla varargs kullanilamaz, cunku en az birisi 
		en sonda olamaz.
			 */
		

public class Vrgs01 {

	public static void main(String[] args) {
			
		xd();
//		add(3, 5); 
//		add();
//		add(3, 5, 7);
//		add(2);
//		add(4, 1, 2, 8);
//		concat("Ali ", "Ayse");
//		yazdir("Isim: ", "A", "l", "i");
	}
		public static void add(int... a) {
		int sum = 0;
		for( int w : a) {
			sum+=w;
		}
		System.out.println(sum);
	}
		//Varargs kullanarak verilen Stringleri birlestiren concat isimli bir method olusturunuz
		
		public static void concat(String... b) {
			String s = "";
			for(String w : b) {
				s = s.concat(w);
			}
			System.out.println(s);
		}
		
		public static void yazdir(String a, String... s) {
			System.out.println(a);
			for(String w :s) {
				System.out.print(w + " ");
			}
		}
		
		public static void xd(int... a) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Kac sayi toplamak istiyosunuz");
			int input = scan.nextInt();
			
			int sum = 0;
			for (int i = 0; i < input; i++) {
				System.out.println(i+1 + ".ci sayiyi giriniz");
				int sayi = scan.nextInt();
				sum+=sayi;
			}
			System.out.println(sum);
		}
		
		
}
