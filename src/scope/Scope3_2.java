package scope;

public class Scope3_2 {

	public static void main(String[] args) {
		int m = 10;
		if (m>0) {
			int temp = m*2;
			System.out.println("temp = "+ temp);
		}
	//	System.out.println(temp); temp 생존x
		System.out.println("m = "+m);
	}
 /*
 	Scope 3_1 보다 3_2 가 더 좋은 코드인 이유는

 	3_1에서는 temp 변수가 main 메서드 전체에서 유효. if문의 내부 뿐 아니라 외부에서도 temp에 접근 가능.
 	3_2에서는 temp변수는 if문 내부에서만 선언되어 있음. 이건 오직 if문의 블록 내에서만 temp스코프가 유효하다는 것.
 	변수를 사용할 필요한 가장 좁은 스코프 내에 선언함으로써 코드의 가독성과 유지보수성이 향상됨.
  */
}
