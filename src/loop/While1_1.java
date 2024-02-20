package loop;

public class While1_1 {

	public static void main(String[] args) {
		int count = 0;

		count = count + 1;
		System.out.println("현재 숫자는:" + count);
		count = count + 1;
		System.out.println("현재 숫자는:" + count);
		count = count + 1;
		System.out.println("현재 숫자는:" + count);

		//같은 코드가 3번 반복되고 있다. 좋지 않은 코드다.
		//count++; 로 해도 sysout을 세번 적어야 한다. 이러지 않기 위해 반복문 (while, for)문을 사용한다.

	}
}
