package slide17homework;

import java.util.Arrays;

public class Question05 {

	public static void main(String[] args) {
		/*
		 For-each loop Soru 4:
Bir String oluşturunuz, bu String’deki character’leri yukarıdan aşağıya
for-each loop kullanarak yazdırınız.
İpucu: split(
		 */

		
			String s = "ASDFGH QWERTY";
			String arr[] = s.replace(" ", "").split("");
			System.out.println(Arrays.toString(arr));
			
			for(String w: arr) {
				System.out.println(w);
			}
	}

}
