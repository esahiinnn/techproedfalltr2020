package day23foreachloopdatetime;

public class ForEachSoru01 {

	public static void main(String[] args) {
		/*
		 	Asagida verilen multidimensional array'in elemanlarinin carpimini bulunuz.
		 */
			
			int arr[][] = {{2, 3}, {4}, {5, 6, 7}};
			int product = 1;
			for(int [] w:arr) {
				for(int x : w) {
					product *=x;
				}
			}
			System.out.println(product);
			
			
			int carpim = 1 ;
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0 ; j<arr[i].length; j++) {
					carpim*=arr[i][j];
				}
			}
			System.out.println(carpim);
	}

}
