package day11stringmethods;

import java.util.Scanner;

public class String04 {

	public static void main(String[] args) {
		/*
		 1)Kullanicidan bir String alin
2)Tum rakamlari * a cevirin
3)Bas ve sondaki tum space'leri silin
4)Aralardaki tum space'leri ! isaretine cevirin
5)a ve z harflerini buyuk harf, diger tum harfleri kucuk harf yapin
6)En bas'a "(" ve en sona ")" ekleyin
		 */
			Scanner scan = new Scanner(System.in);
			// 1)Kullanicidan bir String alin
			System.out.println("Bir string giriniz");
			String str = scan.nextLine();
			//2)Tum rakamlari * a cevirin
			str = str.replaceAll("\\d", "*");
			System.out.println(str);
			//3)Bas ve sondaki tum space'leri silin
			str = str.trim();
			System.out.println(str);
			//4)Aralardaki tum space'leri ! isaretine cevirin
			str = str.replaceAll("\\s", "!");
			System.out.println(str);
			//5)a ve z harflerini buyuk harf, diger tum harfleri kucuk harf yapin
			str = str.replace('a', 'A');
			str = str.replace('z', 'Z');
			System.out.println(str);
			//6)En bas'a "(" ve en sona ")" ekleyin
			str = "(" + str + ")";
			System.out.println(str);
		
		
	
		scan.close();
		
	}

}
