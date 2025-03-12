package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: // break가 없으면 스위치문을 안빠져나오고 아래 case3 코드를 실행을 한다.
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
