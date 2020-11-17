package slide13homework;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 1)While loop kullanarak 3 den 13 e kadar tum tek tamsayıları ekrana yazdırınız.
		 */

		
		int i=3;
		while(i<=13) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
			
			i++;
		}
	}

}
