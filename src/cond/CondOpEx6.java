package cond;

public class CondOpEx6 {

	public static void main(String[] args) {
		/*더 큰 숫자 찾기.
		여러분은 두 개의 정수 a와 b를 가지고 있다. a의 값은 10, b의 값은 20.
		삼항 연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력하는 코드를 작성해보시오.

		출력 예시) 더 큰 숫자는 20입니다.
		 */
		int a = 10;
		int b = 20;

		int max = (a>b) ? a : b;
		System.out.println("더 큰 숫자는 "+ max + "입니다.");
	}
}
