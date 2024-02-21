package casting;

public class Casting3 {

	public static void main(String[] args) {
		long maxIntValue = 2147483647; //int 최고값
		//long maxIntOver = 2147483648; //Integer number too large 오류
		long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
		int intValue = 0;

		intValue = (int) maxIntValue; //형변환
		System.out.println("maxIntValue casting= " + intValue); //2147483647 가 출력이 된다.

		intValue = (int) maxIntOver;
		System.out.println("maxIntOver casting=" + intValue); // -2147483648 가 출력이 됨. -가 붙는다. 이것이 오버플로우 문제이다.
	}
}
