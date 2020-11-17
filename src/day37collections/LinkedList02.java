package day37collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {

	public static void main(String[] args) {
		
			List<Integer> ll1 = new LinkedList<>();
			ll1.add(3);
			ll1.add(2);
			ll1.add(0);
			ll1.add(1);
			ll1.add(33);
			System.out.println(ll1);
			
			ll1.remove(2); //remove() method'unun icine integer koyarsaniz Java her zaman onu index kabul eder.
									//Burada index'i 2 olan sifir silinir.
			System.out.println(ll1);
			
			//remove() method'unun icinde olmayan bir index kullanirsaniz 
			//Java IndexOutOfBoundsException throw eder
			//ll1.remove(33);
			
	}

}
