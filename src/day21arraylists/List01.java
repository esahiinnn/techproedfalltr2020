package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		
		//List'e eleman eklemenin 2 yolu vardir.
		ls.add("B");
		ls.add("M");
		ls.add("A");
		ls.add(1, "K");
		ls.add(0, "S");
		ls.add("T");
		ls.add("M");
		System.out.println(ls);//[S, B, K, M, A, T]
		
		//List'in icindeki eleman sayisini bulmak
		//Array'lerin eleman sayisinden bahsederken "Array'in lenght'i" deyiniz.
		//List'lerin eleman sayisinden bahsederken "List'in size'i" deyiniz.
		System.out.println(ls.size());//6
		
		//Bir List'in bos olup olmadigini kontrol etmek
		
		System.out.println(ls.isEmpty());//false
		
		//Bir List'den index kullanarak eleman silmek
		//index ile remove() methodunu kullanirsaniz ve ekrana yazdirirsaniz, Java sildigi elemani ekrana yazar
		System.out.println(ls.remove(2));
		System.out.println(ls);//[S, B, M, A, T]
		
		//Bir List'den eleman ile kullanarak eleman silmek
		System.out.println(ls.remove("T"));//true
		System.out.println(ls);// [S, B, M, A]
		
		System.out.println(ls.remove("X"));//false
		System.out.println(ls);//[S, B, M, A]
		
		ls.remove("M");
		System.out.println(ls); //[S, B, A, M]
		
		//Bir List'te istenen elemanin var olup olmadigini kontrol etmek
		System.out.println(ls.contains("B")); //true
		
		//Belli bir list'in istenen index'indeki elemani degistirmek
		System.out.println(ls.set(1, "Bursa"));//B
		System.out.println(ls);//[S, Bursa, A, M]
		
		//Bir List'deki elemanlari siramalak
		Collections.sort(ls); // <=UNUTMAYIN ONEMLI =>
		System.out.println(ls); //[A, Bursa, M, S]
		
		//Bir List'deki tum elemanlari silmek
		ls.clear();
		System.out.println(ls); //[]
		
		

	}

}
