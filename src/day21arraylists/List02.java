package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// Iki tane Integer List olusturunuz. [1, 3, 1, 2]    [3, 2, 4, 4, 5]
		
		List<Integer> ls = new ArrayList<>();
		
		ls.add(1);
		ls.add(3);
		ls.add(1);
		ls.add(2);
		
		System.out.println(ls);
		
		
		List<Integer> ls2 = new ArrayList<>();
		
		ls2.add(3);
		ls2.add(2);
		ls2.add(4);
		ls2.add(4);
		ls2.add(5);
		
		System.out.println(ls2);
		
		//Bir List'i bir baska list'in sonuna eklemek
		ls.addAll(ls2);
		System.out.println(ls); //[1, 3, 1, 2, 3, 2, 4, 4, 5]
		
		//Bir List'i bir baska List'in istenen index'ine eklemek
		ls.addAll(1, ls2);
		System.out.println(ls); //[1, 3, 2, 4, 4, 5, 3, 1, 2, 3, 2, 4, 4, 5]
		
		//Bir List'den toplu eleman silmek
		ls.removeAll(ls2);
		System.out.println(ls); //[1, 1]
		System.out.println(ls2); // [3, 2, 4, 4, 5]
		
		//Bir List'in bir baska List'e esit olup olmadigini kontrol etmek
		System.out.println(ls.equals(ls2)); 
		System.out.println(ls2.containsAll(ls));//false
		
		List<Integer> ls3 = new ArrayList<>();
		ls3.add(3);
		ls3.add(2);
		
		System.out.println(ls2.containsAll(ls3)); //true
	
		//get() methodu index'i verilen elemani return eder.
		System.out.println(ls2.get(1));//2
		
		//indexOf () methodu verilen elemanin ilk gorunusunun index'ini return eder.
		System.out.println(ls2.indexOf(4));//2
		
		//lastIndexOf () methodu verilen elemanin son gorunumunun index'ini return eder.
		System.out.println(ls2.lastIndexOf(4)); //3
		
		//subList () methodu List'in index1 den index2'ye kadar olan bolumunu return eder.
		//index1 dahil, index2 harictir.
		System.out.println(ls2.subList(1, 3));
	}

}
