package day16constuctors;

public class MethodCreation01 {

	public static void main(String[] args) {

			System.out.println(add(3, 5));
			System.out.println(str("Ebubekir"," Sahin"));
		}
	/*
	 	Method olustururken "void" disinda bir "return type" kullanirsaniz, method body'si icinde
	 	en son satirda "return" keyword kullanmalisiniz, aksi takdirde Compile Time Error alirsiniz.
	 	
	 	"void" disinda kullanilabilecek return type'lar tum primitive ve tum non-primitive return type'lardir.
	 	
	 */
		public static int add (int a, int b) {
			
			return a+b;
			
	}

		
			/*
			 Iki tane String' i concatenate eden bir method olusturunuz
			 */
		public static String str(String a, String b) {
			return a+b;
		}
}
