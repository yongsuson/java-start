package loop;

public class NestedEx1 {

	public static void main(String[] args) {
		//구구단은 1*1 , 1*2, 1*3, 1*4, 1*5 ~~ 9*9 까지임.

		for (int i=1; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
