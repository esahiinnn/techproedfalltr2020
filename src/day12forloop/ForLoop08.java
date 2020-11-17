package day12forloop;

import java.util.Scanner;

public class ForLoop08 {

	public static void main(String[] args) {
		/*
		 Kullanicidan baslangic ve bitis degerlerini aliniz
		 Baslangic ve bitis degerleri nasil olursa olsun carpimi hesaplayan 
		 baslangic degerinden bitis degerine kadar tum tam sayilarin carpimini hesaplayan programi yaziniz
		 */

				
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Baslangic noktasini giriniz");
			int bas = scan.nextInt();
			System.out.println("Bitis noktasini giriniz");
			int son = scan.nextInt();
			
			int carpim = 1;
			if(bas>son) {
				for(int i=son; i<=bas; i++) {
					carpim *=i;
				}
				
			}else {
			for(int i =bas; i<=son ; i++) {
				carpim *=i;
			}	
			
		}
			System.out.println("Carpim : " + carpim);
			scan.close();
	}

}
