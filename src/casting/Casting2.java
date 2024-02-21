package casting;

public class Casting2 {

	public static void main(String[] args) {
		double doubleValue = 1.5;
		int intValue = 0;

		//intValue = doubleValue;  이건 컴파일 오류가 발생한다.

		intValue = (int) doubleValue;// 명시적 형변환
		System.out.println(intValue); //1.5에서 0.5가 사라지고 1만 출력이 된다.

	}
}
