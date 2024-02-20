package loop;

public class ForEx2 {

	public static void main(String[] args) {

		for(int num=2, count=1; count<=10; num+=2, count++) {
			System.out.println(num);
		}
	}
	/*
	위에 코드보다 더 좋은 코드.
	int num=2;
	for (int count=1; count<=10; count++) {
	sout(num);
	num+=2;
	}
	 */
}
