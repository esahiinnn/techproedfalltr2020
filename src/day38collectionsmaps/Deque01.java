package day38collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
		/*
		 	1) Double Ended Queue (Deque) : Queue'larda FIFO gecerlidir, Deque'larda 
		 hem FIFO hem LIFO gecerlidir.
		 */

	public static void main(String[] args) {
		
		
			Deque<String> dq1 = new LinkedList<>();
			
			dq1.add("Ali");
			dq1.add("Veli");
			dq1.add("Aydin");
			dq1.add("Merve");
			dq1.add("Kadriye");
			System.out.println(dq1); // [Ali, Veli, Aydin, Merve, Kardiye]
			
			System.out.println(dq1.getFirst()); // Ali (copy-paste peek)
			System.out.println(dq1); // [Ali, Veli, Aydin, Merve, Kardiye]
			
			
			System.out.println(dq1.getLast()); // Kardiye
			System.out.println(dq1); // [Ali, Veli, Aydin, Merve, Kardiye]
			
			System.out.println(dq1.peekFirst()); // Ali (copy-paste)
			System.out.println(dq1); // [Ali, Veli, Aydin, Merve, Kardiye]
			System.out.println(dq1.peekLast());
			
			/*
		 	Note: getFirst() ve peekFirst() methodlarinin ikisi de ilk elemani silmeden return eder 
		 fakat, getFirst() bos deque'lerde kullanildiginda NoSuchElementException throw eder,
		 peekFirst() ise Exception throw etmez  null return eder.
			
			Yukaridaki kural getLast() ve peekLast() methodlari icin de gecerlidir.
		 */
		
			
			//dq1.clear();
			//System.out.println(dq1.peekFirst()); null
			//System.out.println(dq1.getFirst()); NoSuchElementException
			
			System.out.println(dq1.pollFirst());// Ali (cut-paste)
			System.out.println(dq1); // [Veli, Aydin, Merve, Kardiye]
			
			System.out.println(dq1.pollLast()); // Kadriye
			System.out.println(dq1); // [Veli, Aydin, Merve]
			
			
	}

}
