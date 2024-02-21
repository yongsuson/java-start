package casting;
//형변환 - 자동 형변환
public class Casting1 {

	public static void main(String[] args) {

		/*자바는 작은 범위에서 큰 범위로의 대입은 허용한다.
		쉽게 말해서 큰 그릇은 작은 그릇에 담긴 내용물을 담을 수 있다. 그렇지만 자바에서 형변환은 꼭 해줘야 하는것이다.
		작은 그릇에 있는걸 큰 그릇으로 옮겨 담을 때는 자동으로 형변환을 해준다. ---> 이것을 묵시적 형변환 이라고 한다.
		int < long < double
		 */
		int intValue = 10;
		long longValue;
		double doubleValue;

		longValue = intValue; //int --> long
		System.out.println("longValue = "+longValue);

		doubleValue = intValue;
		System.out.println("doubleValue= "+ doubleValue); //double 형이기 때문에 뒤에 소수점 하나가 붙음 10.0으로

		doubleValue = 20L; //long -> double
		System.out.println("doubleValue2= "+ doubleValue);

	}
}
