package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
//        int temp = 0;
//        if (m > 0) {
//            temp = m * 2;
//            System.out.println("temp = " + temp);
//        }
//        System.out.println("m = " + m);

        // 위에 코드처럼 temp변수에 스코프를 크게 잡으면 불필요한 메모리를 사용하고
        // 변수명 때문에 코드에 복잡성이 증가한다.
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
