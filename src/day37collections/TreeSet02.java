package day37collections;

import java.util.*;


public class TreeSet02 {
		
	/*
	 		Soru: Elemanlari Alfabetik sirada dizen ve tekrarsiz bir collection elde etmek isterseniz ne kullanirsiniz
	 	Cevap: TreeSet
	 	
	 		Soru: Ama TreeSet cok yavastir. Nasil bir cozum bulabilirsin?
	 	Cevap: HashSet olustururum, elemanlari HashSet'e eklerim.
	 	Sonra HashSet'i TreeSet'e ceviririm boylece tekrarsiz ve alfabetik sirada bir collection'a sahip olmus olurum.
	 */

	public static void main(String[] args) {
		
		long startingTime1 = System.currentTimeMillis();
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Ali");
		hs1.add("Veli");
		hs1.add("Canan");
		hs1.add("Beyhan");
		hs1.add("Ayhan");
		hs1.add("Seyhan");
		hs1.add("Ramazan");
		hs1.add("Daghan");
		System.out.println(hs1); // [Canan, Ayhan, Veli, Seyhan, Ramazan, Beyhan, Daghan, Ali]
		
		TreeSet<String> ts1 = new TreeSet<>(hs1);
		System.out.println(ts1); // [Ali, Ayhan, Beyhan, Canan, Daghan, Ramazan, Seyhan, Veli]
		long endingTime1 = System.currentTimeMillis();
		System.out.println("Hash + Tree : " + (endingTime1 - startingTime1));
		
		long startingTime2 = System.currentTimeMillis();
		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add("Ali");
		ts2.add("Veli");
		ts2.add("Canan");
		ts2.add("Beyhan");
		ts2.add("Ayhan");
		ts2.add("Seyhan");
		ts2.add("Ramazan");
		ts2.add("Daghan");
		System.out.println(ts2);
		long endingTime2 = System.currentTimeMillis();
		System.out.println("Tree : " + (startingTime2 - endingTime2));
		
	}
	
	
	
	
	
	
			

}
