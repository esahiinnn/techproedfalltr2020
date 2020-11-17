package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// split() methodu
			
		String s = "Calis bakalim zor mu?";
		
		String words1[] = s.split(" ");		
		System.out.println(Arrays.toString(words1));		
		System.out.println("Kelima sayisi:  " + words1.length);
		
		//"s" String'inde kac karakter kullanilmistir.
		
		String words2[] = s.split("");
		System.out.println(Arrays.toString(words2));
		System.out.println("Character sayisi: " + words2.length);
		
		//"s" String'inde bosluk haric kac karakter kullanilmistir
		
		String words3[] = s.replace(" ", "").split("");
		System.out.println(Arrays.toString(words3));
		System.out.println("Bosluk haric character sayisi: " + words3.length);
		
		//"s" String'inde kac tane "a" characteri vardir.
		
		String words4[] = s.split("");
		int counter = 0;
			for(int i=0; i<words4.length; i++) {
				if(words4[i].equals("a"))
					counter++;
			}
		System.out.println("Sorulan character'in sayisi : " + counter);
		
		//Bir String'de kullanilan tum harflerin sayisini gosteren kod yaziniz
		//Ornegin Alaaddin ==> A=1, l=1, a=2, d=2, i=1, n=1
		
	}

}
