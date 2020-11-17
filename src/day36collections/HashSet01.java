package day36collections;

import java.util.HashSet;
import java.util.Set;

public class HashSet01 {
	

			/*
	 			1) Tekrarli elemana musade edilmez. Set'lerin icinde bir eleman sadece bir kere kullanilabilir.
	 			
	 			2) Haset'ler Set'ler arasinda en hizli olandir
	 			
	 			3) Hashset elemanlari siralamak ile siralamak ile ugrasmaz. Elemanlari rastgele dizer
	 			
	 			4) HashSet "null" object'ini eleman olarak kullanabilir.
	 			
	 			5) 
	 			
	 			
	 */

	public static void main(String[] args) {
		
			Set<String> hs1 = new HashSet<>();
			hs1.add("Ali");
			hs1.add("Veli");
			//HashSet'e tekrarli eleman yollarsaniz ustune yazar.
			hs1.add("Veli");
			hs1.add(null);
			hs1.add(null);
			hs1.add(null);
			hs1.add(null);
			System.out.println(hs1); // [null, Veli, Ali]
			System.out.println(hs1.size());
			
			// Java her data icin hashing teknigini kullanarak bir code uretir.
			// Bu code'u almak icin HashCode() methodu kullanilir.
			System.out.println(hs1.hashCode());
			
			
			
			
	}

}
