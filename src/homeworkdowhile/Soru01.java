package homeworkdowhile;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 9 den 190 e kadar 7 nin kati olan tüm tamsayıları ekrana yazdırınız.
		 */

			int i = 9;
			do {
					if(i%7==0) {
						System.out.print(i +" ");
					}
				i++;
			}while(i<190);
	}

}
