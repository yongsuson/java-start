package cond;

public class If1 {

	public static void main(String[] args) {
		int age = 15;

		if (age >= 18) {
			System.out.println("성인입니다.");
		}

		if (age < 18) {
				System.out.println("응애입니다.");
			}
		if (age > 21) { //false면 출력이 되지 않는다.
						//true일 때만 코드를 실행한다.
			System.out.println("ddd");
		}
		}
	}

