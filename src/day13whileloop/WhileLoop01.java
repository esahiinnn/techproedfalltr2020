package day13whileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		/*
		 For Loop kullanarak 1'den 5'e kadar tam sayilari ekrana yazdiriniz
		 */
			
		
			for(int i = 1; i<=5; i++) {
				System.out.print(i+ " ");
			}
			/*
			 While Loop kullanarak 1'den 5'e kadar tam sayilari ekrana yazdiriniz
			 */
			System.out.println();
			int h=1;
			while(h<=5) {
				System.out.println(h);
				h++;
			}
			
			
			System.out.println();
			/*
			 While Loop kullanarak 10'dan kucuk sayma sayilarini, ayni satirda, aralarina bosluk koyarak yaziniz 
			 */
			int j=1;
			while(j<10) {
				System.out.print(j + " ");
				j++;
				
			}
		
			System.out.println();
			/*
			 While Loop kullanarak 1 ile 50 arasindaki cift sayilari yazdirin
			 */
			int k=1;
			while(k<50) {
				if(k%2==0) {
					System.out.print(k + " ");	
				}
				k++;
			}
			System.out.println();
			/*
			 While Loop kullanarak "Java kolaydir" Stringini tersten yazdiriniz
			 */
			
			String s = "Java kolaydir";
			
			int l =s.length()-1;
					
				while(l>=0) {
					System.out.print(s.charAt(l));
					l--;
				}
	}

}
