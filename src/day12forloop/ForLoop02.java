package day12forloop;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden veya sonrasından
başlayıp bitiş değerinde veya öncesinde  biten tüm çift tamsayıları ekrana yazdırın.
		 
		 */

		
			Scanner scan = new Scanner(System.in);
			System.out.println("Baslangic noktasini giriniz");
			int bas = scan.nextInt();
			System.out.println("Bitis noktasini giriniz");
			int son = scan.nextInt();
			
			if(bas>son) {
				System.out.println("Baslangic degeri bitis degerinden buyuk olmamalidir");
			}else {
				for(int i =bas; i<=son; i++) {
						if(i%2==0) {
							System.out.print(i + " ");
						}
						
					}
				scan.close();
		
		}

	}
}