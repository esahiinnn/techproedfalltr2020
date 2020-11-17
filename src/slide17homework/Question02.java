package slide17homework;

public class Question02 {

	public static void main(String[] args) {
		/*
		 For-each loop Soru 1:
Bir integer array oluşturunuz ve bu array’deki tum sayıların çarpımını
For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		 */

			
			int arr[] = {1, 2, 7, 5, 3};
			int product = 1;
			for(int w : arr) {
				product *= w;
			}
			System.out.println(product);
	}

}
