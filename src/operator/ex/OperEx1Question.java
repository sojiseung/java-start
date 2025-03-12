package operator.ex;

public class OperEx1Question {
    public static void main(String[] args) {
        /* 1. 다음과 같은 작업을 수행하는 프로그램을 작성하세요.
            - num1, num2, num3라는 이름의 세 개의 int 변수를 선언하고, 각각 10, 20, 30으로 초기화 하세요.
            - 세 변수의 합을 계산하고, 그 결과를 sum이라는 이름의 int 변수에 저장하세요.
            - 세 변수의 평균을 계산하고, 그 결과를 average라는 이름의 int 변수에 저장하세요. 평균 계산 시 소주점 이하의 결과는 버림하세요.
            - sum과 average변수의 값을 출력하세요.

            참고
            자바에서 int끼리의 나눗셈은 자동으로 소수점 이하를 버린다.
         */
        
        int num1 =10, num2 = 20, num3 = 30;
        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println("average = " + average);

        // 2. 다음 double 변수들을 선언하고 그 합과 평균을 출력하는 프로그램을 작성하세요.
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum2 = val1 + val2 + val3;
        double average2 = sum2 / 3;

        System.out.println("sum2 = " + sum2);
        System.out.println("average2 = " + average2);

        /* 3. 다음과 같이 수행하시오.
            - int형 변수 score를 선언하세요.
            - score가  80점 이상이고, 100점 이하면 true를 출력하고, 아니면 false를 출력하세요.
         */
        int score = 100;
        boolean result =  score >= 80 && score <= 100;
        System.out.println(result);
    }
}
