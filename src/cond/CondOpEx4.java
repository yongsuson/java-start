package cond;

public class CondOpEx4 {

	public static void main(String[] args) {
		double rating = 8.4;

		String A = "Godzilla ";
		String B = "ToyStory ";
		String C = "AboutTime";

		if (rating >=7) {
			System.out.println(A+ B+ C+"을(를) 추천합니다.");
		}else if (rating >=8) {
			System.out.println(B+ C+"을(를) 추천합니다.");
		}else {
			System.out.println(C+ "을 추천합니다.");
		}
	}
	/*
	if(rating <= 9) {
	sout("'어바웃타임'을 추천합니다.");
	}
	if (rating <=8) {
	sout("'토이 스토리'를 추천합니다.");
	}
	if (rating <= 7) {
	sout("'고질라'를 추천합니다.");
	** 위에서 부터 내려와야 제대로 나오지 않겠니? 그치?
	 */
}
