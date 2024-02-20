package cond;

public class If2 {

	public static void main(String[] args) {
		int age = 20;

		if (age >= 18) {
			System.out.println("성인");
		} else {
			System.out.println("응애.");
		}
		//문제

		int age1 = 14;
		if (age1 <= 7) {
			System.out.println("미취학");
		}
		if (age >=8 && age <= 13){
			System.out.println("초등학생");
		}
		if (age>=14 && age <= 16){
			System.out.println("중딩");
		}
		if (age >= 17 && age<-19){
			System.out.println("고딩");
		}
		if (age >= 20) {
			System.out.println("성인");
		}
	}

}
