package homework18;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays05v3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("kac elemanli bir array olusturacaksin");
		int eleman = scan.nextInt();
		int kume[] = new int[eleman];
		for (int i = 0; i < kume.length; i++) {
			System.out.println("sayi gir.");
			int k = scan.nextInt();
			if (i == kume.length - 1) {	kume[0] = k;	}
			else {	kume[i + 1] = k;	}
		}
		System.out.println(Arrays.toString(kume));
		scan.close();

	}

}
