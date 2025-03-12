package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a =2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        
        // 결과를 boolean 변수에 담을 수 있다
        boolean result = a == b;
        System.out.println("result = " + result);

        // 문자열 비교
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello") ;  // 리터럴 비교
        boolean result2 = str1.equals("문자열1");   // 문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2);   // 문자열 변수 비교

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

    }
}
