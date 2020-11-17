package slide16homeworks;

public class Question06 {

	public static void main(String[] args) {
		
		int [] x1 = {0, 1, 2, 3};
		int [] x2 = {1, 2, 2, 3};
		int i1 = 0;
		int i2 = 0;
		int count = 0;					
		while((i1<x1.length) && (i2<x2.length)) {
			if(x1[i1] == x2[i2]) {
				count++;				//i1=0 i2=0 count =0 
				i2++;					//i1 =1 count =1 i2 =1 
			}else if(x1[i1] < x2[i2]){ //i1=2 count = 2 i2 =2
				i1++;					//i1=2 count = 3 i2 = 3
			}else {						//i1=3 count =3 i2 =3
				i2++;					//i1=3 count =4 i2=4
			}
		}
		System.out.println(count + " " + i1 + " " + i2);
	}

}
