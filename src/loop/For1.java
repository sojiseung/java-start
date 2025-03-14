package loop;

public class For1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        int sum =0;
        int endNum = 3;

        // 1+2+3 = 6
        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        // for1
        sum = 0;
        int i =1;

        for (; ; ) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 : " + sum);
                break;
            }
            i++;
        }   // for문은 초기식, 조건식, 증감식을 위와 같이 생략을 할 수 있다.

    }
}
