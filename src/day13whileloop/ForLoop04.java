package day13whileloop;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
		 Satir sayisini kullanicidan alarak asagidaki gibi sekil olusturunuz
		 
		 					 
		 					  * * * 
		 					   * * 
		 					    * 
		 */

				Scanner scan = new Scanner(System.in);
				System.out.println("Satir sayisini giriniz");
				int s = scan.nextInt();
				
				//Satir sayisi icin for loop;
				
				for(int i=1; i<=s; i++) {
					//bosluk sayisi icin for loop;
					for(int j =0; j<=i; j++) {
						System.out.print(" ");
					}
					//* sayisi icin for loop;
					for(int k=s; k>=i; k--) {
						System.out.print("* ");
					}
					
				System.out.println();
	
				}
				scan.close();
	}

}
