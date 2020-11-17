package day06ifstatement;

import java.util.Scanner;

public class Ifelse03 {

	public static void main(String[] args) {
		/*
		 	Kullanicidan bir tam sayi alin ve o tam sayinin mutlak degerini ekrana yazdiriniz
		 */
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam sayi girin");
		int a = scan.nextInt();
		
		
		if(a>=0) 
		{
			System.out.println(a);
		}
		else 
		{
			System.out.println(-a);
		}
		scan.close();
	}

}
