package cond;

public class If2 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

//        if (price >= 10000) {
//            discount += 1000;
//            System.out.println("10,000원 이상 구매, 1,000원 할인 -1,000원");
//        }
//
//        if (age <= 10) {
//            discount += 1000;
//            System.out.println("나이 10살 이하는 1,000원 할인, -1,000원");
//        }

        // if문은 중괄호를  생략 가능함, 다만 생략을 할경우 아래 한문장만 실행한다.
        if (true)
            System.out.println("중괄호 생략");

        System.out.println("+++++++++++===============+++++++++++++");

        if (false)
            System.out.println("중괄호 생략");
            System.out.println("조건문 아래코드만 생략");

        System.out.println("+++++++++++===============+++++++++++++");

        // 이렇게도 가능함
        if (price >= 10000) {
            discount += 1000;
            System.out.println("10,000원 이상 구매, 1,000원 할인 -1,000원");
            if (age <= 10) {
                discount += 1000;
                System.out.println("나이 10살 이하는 1,000원 할인, -1,000원");
            }
        }

        System.out.println("총 할인금액 : -" + discount + "원");
    }

}
