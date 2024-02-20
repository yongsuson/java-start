package loop;

public class ForEx3 {

	public static void main(String[] args) {
		int max= 100;

		int sum=0;

		for (int i = 1; i<=max;) {
			sum += i;
			i++;

			System.out.println(sum);
		}
	}
}
