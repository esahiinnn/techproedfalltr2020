package slide18homework;

public class Question05 {

	public static void main(String[] args) {
		
		Question05 rope = new Question05();
		rope.play();
		Question05 rope2 = null;
		rope2.play();
		
		
	}
	public static void swing() {
		System.out.println("swing");
	}
	public void climb() {
		System.out.println("climb");
	}
	public static void play() {
		swing();
//		climb(); //climb methodu static olmadigini icin cte aliriz.
	}
}
