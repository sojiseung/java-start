package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);
        // do-while문은 코드블럭을 먼저 실행하고 조건식을 확인
    }
}
