package day13whileloop;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 	For Loop kullanarak asagida verilen sekli olusturunuz
		 				*
		 				**
		 				***
		 				****
		 				*****
		 */

			for(int i =1; i<=5; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
				
				
	}

}
