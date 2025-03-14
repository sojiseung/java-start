package loop.ex;

public class LoopEx1Q {
    public static void main(String[] args) {
        /* 1. 처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요. 이때, count라는 변수를 사용해야 합니다.

        * while문, for문 2가지 버전의 정답을 만들어야 합니다.
         */
        int count = 1;
        while (count <= 10) {
            System.out.println("count = " + count);
            count++;
        }

        count = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println("count = " + count);
            count++;
        }
        /*
        for (int count =1; count <= 10; count++) {
            System.out.println("count = " + count);
        }
         */

        /* 2. 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때, num이라는 변수를 사용하여 수를 표현해야 합니다.

        * while문, for문 2가지 버전의 정답을 만들어야 합니다.
         */
        int num = 2;
        count = 1;
        while (count <= 10) {
            if (num % 2 == 0) {
                System.out.println("짝수 10개 : " + num);
            }
            num+=2;
            count++;
        }   // 어차피 num을 2씩 더하기 때문에 if문은 생략가능

        for (int num1 = 2, count1 = 1; count1 <= 10; num1 += 2, count1++) {
            System.out.println(num1);
        }

        /* 3. 반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램을 작성해 보세요.
         이때, sum이라는 변수를 사용하여 누적 합을 표현하고, i라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행해야 합니다.

         * while문, for문 2가지 버전의 정답을 만들어야 합니다.
         */
        int sum = 0, max = 100, i = 1;
        while (i <= max){
            sum += i;
            i++;
        }
        System.out.println("변수의 합 : " + sum);

        sum = 0;
        for (int max1 = 100, i1 = 1; i1 <= max1; i1++) {
            sum += i1;
        }
        System.out.println(sum);

        // 4. 중첩 for문을 사용해서 구구단을 완성해라.
        for (int i1 = 1; i1 < 10; i1++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i1 + " X " + j + " = " + i1 * j);
            }
        }

        // 5. int rows를 선언해라, 이 수만큼 다음과 같은 피라미드를 출력하면 된다.
        // 참고 : println()은 출력후 다음 라인으로 넘어간다. 라인을 넘기지 않고 출력하려면 print()를 사용하면 된다.
        int rows = 6;
        for (int i1 = 1; i1 <= rows; i1++) {
            for (int j = 1; j <= rows; j++) {
                if (i1 + 1 > j) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        // 더 간결한 코드
        for (int i1 = 1; i1 <= rows; i1++) {
            for (int j = 1; j <= i1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
