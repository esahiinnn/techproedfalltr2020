package day06ifstatement;

import java.util.Scanner;

public class Ifstatement02 {

	public static void main(String[] args) {
		
	        // Kullanicidan bir sayi alin bu sayi cift sayi ise consola "cift"
	        //tek sayi ise consola "Tek" yazdirin
	        
	        Scanner scan = new Scanner (System.in);
	        System.out.println("Bir sayi giriniz");
	        
	        int s = scan.nextInt();
	        
	        if(s % 2 == 0) {
	            System.out.println("Cift");
	            
	        }else {
	       
	            System.out.println("Tek");
	        }

scan.close();

	}

}
