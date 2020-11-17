package slide16homeworks;

import java.util.Arrays;

public class Question05 {

	public static void main(String[] args) {
		
		int[] x = {0, 1, 2, 3};
		int temp;
		int i = 0;
		int j = x.length-1;
		while(i<j) {
			temp = x[i];
			x[i] = x[j];
			x[j] = 2*temp;
			i++;
			j--;
		}
		//j=3 i=0
		//temp = 0 x[0] =3 x[3] =2*0
		//j =2 i =1 temp = 1 x[1] = 2 x[2] = 2
		
		//x[4] = {3, 2, 2, 0}
		System.out.println(Arrays.toString(x));
	}

}
