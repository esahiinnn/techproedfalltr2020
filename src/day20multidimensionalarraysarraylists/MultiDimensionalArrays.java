package day20multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		int ma[][] = {{11, 5}, {7, 11}, {21, 17, 28}, {10, 10}};

		System.out.println(Arrays.deepToString(ma)); //[[11, 5], [7], [21, 17, 28]]
		
		System.out.println(Arrays.toString(ma[2])); //[21, 17, 28]
		
		System.out.println(ma[2][1]);//17
		
		// ma multidimensional array'inin tum elemanlarini ayni satirda aralarina bosluk birakarak yazdiriniz
		
		for(int i = 0; i<ma.length; i++) {
			for(int j = 0; j<ma[i].length; j++) {
				System.out.print(ma[i][j] + " ");
			}
		}
		System.out.println();
		//ma multidimensional array'inin tum elemanlarinin toplamini ekrana yazdiran programi yaziniz
		
		int toplam = 0;
		for(int i = 0; i<ma.length; i++) {
			for(int j = 0; j<ma[i].length; j++) {
				toplam += ma[i][j];
			}
		}
		System.out.println("Sayilarin toplami = " + toplam);
		
		//ma multidimensional array'inin tum elemanlarinin carpimini ekrana yazdiran programi yazdirin(ODEV!!!)
			int ma2[][] = {{3, 5}, {2}, {4}};
			int carpim =1;
			for(int i=0; i<ma2.length; i++) {
				for(int j=0; j<ma2[i].length; j++) {
					carpim *=ma2[i][j];
				}
			}
		System.out.println("Sayilarin carpimi = "+carpim);
		
		//ma multidimensional array'inin cift olanlarinin karesini ekrana yazdirin
		
		
		
		
	}

}
