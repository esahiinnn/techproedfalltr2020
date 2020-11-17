package slide16homeworks;

public class Question04 {

	public static void main(String[] args) {
		
		
		int [] x = {2, 1, 4, 5};
		
		int limit = 3;
		int i = 0;
		int sum = 0;
		
		while((sum<limit) && (i < x.length)) {
			i++;
			sum = sum + x[i];
		}
		System.out.println(i);//2
		//i = 1 sum = 1
		//i = 2 sum = 4+1
		
	}

}
