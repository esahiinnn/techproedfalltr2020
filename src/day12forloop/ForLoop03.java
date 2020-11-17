package day12forloop;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin o sayidan kucuk olan tum pozitif tek sayilari yazdirin
		 */

		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz");
		int s = scan.nextInt();
			
		
			if(s<1) {
				System.out.println("Pozitif bir tam sayi giriniz");
			}else {
				for(int i=s ; i>=1; i--) {
					if(i%2!=0) {
						System.out.print(i + " ");
					}
				}
			}
		
		scan.close();
	
		
	}
}
