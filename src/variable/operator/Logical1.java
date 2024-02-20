package variable.operator;

public class Logical1 {
	public static void main(String[] args) {
		System.out.println("&&: AND연산");
		System.out.println(true && true);
		System.out.println(true && false);
		// &&: 두 피연산자가 모두 참이어야 true를 반환한다. 둘중 하나라도 거짓이면 false
		// ||: or 연산자. 두 피연산자 중 하나라도 참이면 true를 반환한다. 둘 다 모두 거짓이면 false를 반환한다.
		// ! : 피연산자의 논리적 부정을 반환한다. 참이면 거짓을, 거짓이면 참을 반환한다.

		System.out.println("||: OR 연산");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);

		System.out.println("! 연산");
		System.out.println(!true);
		System.out.println(!false);

		System.out.println("변수 활용");
		boolean a = true;
		boolean b = false;
		System.out.println(a && b);
		System.out.println(a || b);

		// a && b 는 false를 반환한다. 왜냐하면 둘 중 하나인 b가 거짓이기 때문.
		// a||b는 true를 반환한다. 왜냐하면 둘 중 하나인 a가 참이기 때문이다.
	}
}
