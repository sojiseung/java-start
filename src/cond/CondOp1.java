package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;

        // if문을 이용하면 이렇게 출력
//        String status;
//        if (age >= 18) {
//            status = "성인";
//        } else {
//            status = "미성년자";
//        }

        // 삼항 연산자를 사용하면 이렇게 간결하게 사용이 가능하다. -> ? 참 : 거짓;
        String status = (age >= 18) ? "성인" : "미성년자";




        System.out.println("age = " + age + ", status = " + status);
    }
}
