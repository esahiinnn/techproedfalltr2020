package day03ifstatement;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		
		/*
		 Increment bir variable'in degerini toplama veya carpma kullanarak artirmaya denir.
		 
		 */
			int i1 = 12;
			System.out.println(i1);
			//1.Yol
			i1 = i1 + 5;
			
			System.out.println(i1);
			
			//i1'in degerini 8 artirin
			i1 = i1 + 8;
			System.out.println(i1);//25
			
			//2.Yol Tercih edilir(Recommended)
			i1 += 10;
			System.out.println(i1);
			//i1'i 2.Yol'u kullanarak 5 artirin.

			i1 += 5;
			System.out.println(i1);
			
			//3.Yol : Sadece 1 artirmak istenildiginde kullanilir.
			
			i1++;
			System.out.println(i1);
			
			int i2 = 3;
			System.out.println(i2);
			
			i2 = i2*4;
			System.out.println(i2);
			
			i2 *= 2;
			System.out.println(i2);
			/*
			 Decrement bir variable'in degerini cikarma veya bolme yaparak azaltmak demektir.
			 */
			
			int k = 12;
			System.out.println(k);
		    
			k = k -3;
		   System.out.println(k);
		   
		   k -= 5;
		   System.out.println(k);
		   
		   k --;
		   System.out.println(k);
		   
		   int m = 12;
		   System.out.println(m);
		   
		   m = m/2;
		   System.out.println(m);
		   
		  //Bolme kullanarak 2.Yolla yarisine indirin
		   
		   m /= 2;
		   System.out.println(m);
			
	}

}
