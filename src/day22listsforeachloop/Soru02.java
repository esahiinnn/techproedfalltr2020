package day22listsforeachloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		

			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen Isim ve Soyisminizi giriniz");
			String name = scan.nextLine().replace(" ", "").toUpperCase();
			
			//Ismin harflerini var olan sirada yazdirmak
			List<Character> harfler = new ArrayList<>();
			for(int i = 0; i<name.length(); i++) {
				harfler.add(name.charAt(i));
			}
			System.out.println(harfler);
			
			//Alfabetik siralama
			Collections.sort(harfler);
			System.out.println(harfler);
			
			//Alfabetik siralamanin tersi
			//1.Yol
			List<Character> tersHarfler = new ArrayList<>();
			for (int j=harfler.size()-1; j>=0; j--) {
				tersHarfler.add(harfler.get(j));
			}
			System.out.println(tersHarfler);
			
			//2.Yol
			Collections.reverse(harfler);
			System.out.println(harfler);
			
			scan.close();
	}

}
