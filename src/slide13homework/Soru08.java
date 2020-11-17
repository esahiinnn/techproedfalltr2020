package slide13homework;

public class Soru08 {

	public static void main(String[] args) {
		/*
		 8 den 180 e kadar 5 in kati olan tum tamsayıları ekrana yazdırınız.
		 */

		
			int i = 8;
			while(i<=180) {
				if(i%5==0)
				System.out.print(i + " ");
				i++;
			}
			System.out.println();
			
			for(i=8; i<=180; i++) {
				if(i%5==0) {
					System.out.print(i + " ");
				}
			}
			
			
			
			
	}

}
