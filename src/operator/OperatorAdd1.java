package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a= a + 1;
        System.out.println("a = " + a); // 1

        a = a + 1;
        System.out.println("a = " + a); // 2

        // 증감 연산자
        ++a;    // a = a + 1
        System.out.println("a = " + a); // 3
        ++a;    // a = a + 1
        System.out.println("a = " + a); // 4

//        ===============================================

        // 전위 증감 연산자 사용 예
        int a1 = 1;
        int b = 0;

        b = ++a1;    //a의 값을 먼저 증가시키고, 그 결과를  b에 대입
        System.out.println("a1 = " + a1 + ", " + "b = " + b);

        // 후의 증감 연산자 사용 예
        a1 = 1; // a1 값을 다시 1로 지정
        b = 0; // b의 값을 다시 0으로 지정
        
        b = a1++;    // a의 현제 값을 b에 먼저 대입하고, 그 후 a값을 증가시킴
        System.out.println("a1 = " + a1 + ", " + "b = " + b);
    }
}
