package day04scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alfabeden Bir Harf Giriniz");
		//Kullandiginiz data type char ise asagidaki kodu yaziniz.
		char harf = scan.next().charAt(0);
		System.out.println(harf);
		scan.close();
		
		

	}

}
