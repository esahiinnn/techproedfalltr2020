package slide17homework;

import java.util.ArrayList;
import java.util.List;

public class Question03 {

	public static void main(String[] args) {
		/*
		 For-each loop Soru 2:
Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin toplamını
For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		 */
		
			List<Integer> ls = new ArrayList<>();
			
			ls.add(3);
			ls.add(2);
			ls.add(5);
			ls.add(4);
			
			int sum = 0;
			for(Integer w: ls) {
				
				sum += w*w;
				
			}
			System.out.println("Sayilarin karelerinin toplami = " + sum);
			
			

	}

}
