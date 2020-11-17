package day06ifstatement;

import java.util.Scanner;

public class Ifstatement01 {

	public static void main(String[] args) {
		/*
		 if it rains i ll cancel picnic
		 */
			Scanner scan = new Scanner(System.in);
			System.out.println("iki sayi girin");
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			
		
			if(a > b) {
				System.out.println("ilk sayi buyuktur");	
			}
			else {
				System.out.println("ilk sayi kucuktur");
				scan.close();
			}
	}

}
