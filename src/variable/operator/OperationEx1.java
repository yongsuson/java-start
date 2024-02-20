package variable.operator;

public class OperationEx1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		int sum = num1 + num2 + num3;
		int average = (num1+num2+num3)/3; // sum/3 하면 편함.
		double alltime = 180*0.27;
		System.out.println(sum);
		System.out.println(average);
		System.out.println(alltime);

		int score = 80;
		boolean result = score >= 80 && score <= 100;
	}
}
