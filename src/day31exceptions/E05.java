package day31exceptions;

public class E05 {
	
	/*
	 											NumberFormatException
	 */

	public static void main(String[] args) {
		
		//Java'da sadece rakamlardan olusan String'leri sayiya cevirebiliriz. 
		//Integer Wrapper Class'inin icinde parseInt() methodnu kullaniriz.
		String s = "123";
		System.out.println(s + 5 ); // 1235
		
		int iS = Integer.parseInt(s);
		System.out.println(iS + 5); // 128

		String t = "1a2b";
		System.out.println(t + 5);
		try {
			int iT = Integer.parseInt(t);
			System.out.println(iT + 5);
		}catch(NumberFormatException e) {
			System.out.println("String olustururken rakam disinda characterler kullanilmis.");
		}
		
	}

}
