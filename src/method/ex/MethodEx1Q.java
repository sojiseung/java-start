package method.ex;

public class MethodEx1Q {

    public static void main(String[] args) {
        // 1번 문제
        System.out.println("평균값 : " + ave(1, 2, 3));
        System.out.println("평균값 : " + ave(15, 25, 35));

        // 2번 문제
        msg("Hello, world!", 3);

        // 3번 문제
        int balance = 10000;

        // 입금 1000
        balance = dep(balance, 1000);
        balance = dep(balance, 1000);
        balance = dep(balance, 1000);
        balance = with(balance, 5000);
        balance = with(balance, 5000);

    }
    // 1번
    public static double ave(int a, int b, int c) {
        double average = (a + b + c) / 3;
        return average;
    }

    // 2번
    public static void msg(String msg, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(msg);
        }
    }

    // 3번
    public static int dep(int balance, int a) {
        int bal = balance += a;
        System.out.println(a + "원을 입금하였습니다. 현재 잔액 : " + bal + "원");
        return bal;
    }

    public static int with(int balance, int a) {
        if (balance >= a) {
            balance -= a;
            System.out.println(a + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println(a + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        System.out.println("최종 잔액 : " + balance + "원");
        return balance;
    }

}
