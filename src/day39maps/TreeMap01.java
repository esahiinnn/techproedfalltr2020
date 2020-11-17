package day39maps;

import java.util.TreeMap;

public class TreeMap01 {
	
			/*
			 		1) TreeMap elemanlari natural order'a gore siralar
			 		
			 		2) TreeMap, Map'lerin en yavasidir.
			 		
			 		3) TreeMap'lerde key'ler icin "null" kullanilmaz.
			 		
			 		4) TreeMap'lerde value'lar icin "null" istenildigi kadar kullanilabilir.
			 		
			 		5) TreeMap'ler syncronized ve thread-safe degildirler.
			 */

	public static void main(String[] args) {
		
				TreeMap<Integer, String> tm1 =new TreeMap<>();
				tm1.put(101, "Ali");
				tm1.put(105, "Bahadir");
				tm1.put(104, "Ceylan");
				tm1.put(102, "Ayhan");
				tm1.put(103, "Seyhan");
				System.out.println(tm1) ; // {101=Ali, 102=Ayhan, 103=Seyhan, 104=Ceylan, 105=Bahadir}
				
				tm1.put(100, null);
				tm1.put(106, null);
				tm1.put(107, null);
				System.out.println(tm1); // {100=null, 101=Ali, 102=Ayhan, 103=Seyhan, 104=Ceylan, 105=Bahadir, 106=null, 107=null}
				
				// tm1.put(null, "Ceyhan"); NullPointerException throws
				
				// ceilingKey(95) method'u keyler arasinda 95'e esit olan varsa 95'i return eder
				// esit olan yoksa 95'den buyuk en kucuk key'i return eder. 95 veya 95'den buyuk yoksa null return eder.
				System.out.println(tm1.ceilingKey(95));
				System.out.println(tm1.ceilingEntry(108)); //null
				
				//ascending order: Artan siralama
				//descending order: Azalan siralama
				System.out.println(tm1.descendingKeySet()); // [107, 106, 105, 104, 103, 102, 101, 100]
				System.out.println(tm1.keySet()); // [100, 101, 102, 103, 104, 105, 106, 107]
				
				System.out.println(tm1.firstKey()); //100
				System.out.println(tm1.lastKey()); // 107
				
				
				
	}

}
