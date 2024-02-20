package loop;

public class WhileEx2 {

	public static void main(String[] args) {
		int num = 2;
		int count = 1;
		while (count <= 10) {
			System.out.println(num);
			num += 2;
			count ++;
			/*
			num은 숫자, count는 반복 횟수.
			while문으로 10번 카운트 해라.
			num을 sout해라.
			num은 2씩 증가 시켜라.
			카운트는 1씩 증가한다.
			 */
		}
	}
}
