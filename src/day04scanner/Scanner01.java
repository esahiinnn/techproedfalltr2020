package day04scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) 
	{
		
		//Kullanicidan data almak icin;
		//1.Step : Scanner Class'indan object urettik
			Scanner scan = new Scanner(System.in);
		//2.Step : Kullaniciya mesaj ver.
			System.out.println("Yasinizi Giriniz.");
		//3.Step : Kullanicinin verdigi datayi saklamak icin bir variable olusturun.
			int age = scan.nextInt();
			System.out.println(age);
			scan.close();
			
	}

}
