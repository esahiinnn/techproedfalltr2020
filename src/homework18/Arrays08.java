package homework18;

import java.util.Arrays;

public class Arrays08 {

	public static void main(String[] args) {
		
		String str[] = {"Ali", "Ahmet", "Kemal", "Can"};
		Arrays.sort(str);
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i] + " ");
		}
				//output Ahmet Ali Can Kemal 
	}

}
