package day19arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Array'in length'ini giriniz");
		int length = scan.nextInt();
		int arr [] = new int[length];
		
		int i=0;
		do {
			
				System.out.println("Lutfen array'in index'i " + i + " olanini giriniz ");
				
				arr[i] = scan.nextInt();
				
				i++;
				
				
		
		}while(i<length);
		
			
			System.out.println(Arrays.toString(arr));
			int arr2[] = new int[length];
			
			
			for(int j=length-2; j>=0; j--) {
					arr2[j] = arr[i];
			}
			System.out.println(Arrays.toString(arr2));
	}

}
