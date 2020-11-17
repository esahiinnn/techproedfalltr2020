package day37collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList01 {

	public static void main(String[] args) {
		
			/*
			 		Node'lari "Ali"i "Veli", ve "Ayse" olan bir LinkedList olusturun
			 		Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
			 	"Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
			 		Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin
			 	
			 */

			List<String> ll1 = new LinkedList<>();
			ll1.add("Ali");
			ll1.add("Veli");
			ll1.add("Ayse");
			ll1.add("Can");
			Scanner scan = new Scanner(System.in);
			System.out.println("LinkedList'de aramak istediginiz elemani girin");
			String aranan = scan.next();
			if(ll1.remove(aranan)) {
				System.out.println("Bu isim LinkedList'de vardi ve silindi");
			}else {
				System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
			}
			System.out.println(ll1);
			scan.close();
	}

}
