package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		
		//Multidimensional array'ler nasil olusturulur
			int ma[] [] = new int[3][2];

		//Multidimensional array'ler nasil ekrana yazdirilir
			System.out.println(Arrays.deepToString(ma));//[[0, 0], [0, 0], [0, 0]]
			
			//Multidimensional array'lere nasil eleman eklenir.
			
			ma[0][0] = 33;
			System.out.println(Arrays.deepToString(ma));//[[33, 0], [0, 0], [0, 0]]			
			ma[1][1] = 24;
			System.out.println(Arrays.deepToString(ma));//[[33, 0], [0, 24], [0, 0]]			
			ma[0][1] = 32;
			System.out.println(Arrays.deepToString(ma));//[[33, 32], [0, 24], [0, 0]]			
			ma[1][0] = 23;
			System.out.println(Arrays.deepToString(ma));//[[33, 32], [23, 24], [0, 0]]			
			ma[2][0] = 13;
			System.out.println(Arrays.deepToString(ma));//[[33, 32], [23, 24], [13, 0]]			
			ma[2][1] = 11;
			System.out.println(Arrays.deepToString(ma));//[[33, 32], [23, 24], [13, 11]]			
			
			//Ic array'ler nasil ekrana yazdirilir.
			//[23, 24] array'ini ekrana yazdirin
			System.out.println(Arrays.toString(ma[1]));
			
			//MultiDimensional Array'lerde istenen bir eleman nasil yazdirilir.
			System.out.println(ma[2][0]);
			
			System.out.println(ma[1][1]);
			
			
	}

}
