package cond;

public class If3 {

	public static void main(String[] args) {
		int age= 33;

		if(age <= 7) {
			System.out.println("미취학");
		} else if (age<=13) {
			System.out.println("초등학생");
		} else if (age <= 16) {
			System.out.println("중딩");
		} else if (age <= 19) {
			System.out.println("고딩");
		} else {
			System.out.println("성인");
		}
	}
}
