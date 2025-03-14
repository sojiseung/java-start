package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <=5) {
            if (i == 3) {
                i++;
                continue;
                // i가 3일때 조건식으로 다시 돌아간다
            }
            // 3일때 continue가 실행이 되서 아래코드는 실행이 안된다.
            System.out.println(i);
            i++;
        }

    }
}
