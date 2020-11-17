package day04scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi Giriniz");
		//Data type' i string oldugu zaman next.Line() Methodunu kullanin.
		//Data type String oldugu zaman next() methoduda kullanilabilir.Fakat next() methodu sadece ilk kelimeyi alir, devamini almaz.
		//next.Line() kullanicinin girdigi String'in tamamini alir.
		String name = scan.nextLine();
		System.out.println(name);
		scan.close();
		
		
		
		
		
		

	}

}
