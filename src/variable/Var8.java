package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; // -128 ~ 127
        short s = 32767; //-32768 ~ 32767
        int i = 2147483647; //-2147483648 ~ 2147483648 (약 20억) //int를 기본으로 사용한다.
        long l = 9223372036854775807L; // 개 큼

        //실수
        float f = 10.0f; //소수점 계산은 오류가 굉장히 많이 발생한다. 그래서 권장하지 않음 (float은 계산이 잘 안됨)
        double d = 10.0; //실수 리터럴은 기본적으로 double을 많이 사용한다.


    }
}
