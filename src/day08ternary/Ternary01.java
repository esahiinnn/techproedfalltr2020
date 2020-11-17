package day08ternary;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
	
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir sayi giriniz");
	int s = scan.nextInt();

	String result =	s>9 ? "Rakam degil" : "Rakam";
		System.out.println(result);
		//Ternary kullanirken return de iki farkli data type varsa ternary i direk system.out.println icine yazin
		System.out.println(s>99 && s<1000 ? "3 basamakli" : s);
		scan.close();
	}
}