package cond;

public class CondOpEx5 {

	public static void main(String[] args) {
		String grade = "B";
		
		switch (grade){
			case "A" :
				System.out.println("탁월한 성과입니다.");
				break;
			case "B" :
				System.out.println("좋은 성과입니다.");
				break;
			case "C" :
				System.out.println("준수한 성과입니다.");
				break;
			case "D" :
				System.out.println("향상이 필요합니다.");
				break;
			case "F" :
				System.out.println("불합격입니다.");
				break;

		}
	}
}
