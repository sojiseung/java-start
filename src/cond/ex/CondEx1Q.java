package cond.ex;

public class CondEx1Q {
    public static void main(String[] args) {
        /* 1. 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다.
            - 90점 이상 : "A"
            - 80점 이상 90점 미만 : "B"
            - 70점 이상 80점 미만 : "C"
            - 60점 이상 70점 미만 : "D"
            - 60점 미만 : "F"

            * 점수는 변수(int score)로 지정하고, 해당 변수를 기반으로 학점을 출력하자.
         */
        int score = 70;
        if (score >= 90) {
            System.out.println("학점은 A입니다.");
        } else if (score >=80 && score < 90) {
            System.out.println("학점은 B입니다.");
        } else if (score >=70 && score < 80) {
            System.out.println("학점은 C입니다.");
        } else if (score >=60 && score < 70) {
            System.out.println("학점은 D입니다.");
        } else {
            System.out.println("학점은 F입니다.");
        }
// 위에 조건문에서 AND연산자는 뺴도 됨 else if 문이라 위에 조건식이 참이면 아래 조건식은 수행이 안된다.

        /* 2. 주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다.
            - 거리가 1km 이하이면 : "도보"
            - 거리가 10km 이하이면 : "자전거"
            - 거리가 100km 이하이면 : "자동차"
            - 거리가 100km 초과이면 : "비행기"

            * 거리는 변수(int distance)로 지정하고, 해당 변수를 기반으로 운송 수단을 출력하자.
         */
        int distance = 10;
        if (distance <= 1) {
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 100) {
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }

        /* 3. 특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램을 작성하자. 환율은 1달러당 1300원이라고 가정하자. 다음과 같은 기준을 따른다.
            - 달러가 0미만이면 : "잘못된 금액입니다.
            - 달러가 0일 때 : "환전할 금액이 없습니다."
            - 달러가 0 초과일 때 : "환전 금액은 (계산된 원화 금액)원입니다."

            * 금액은 변수(int dollar)로 지정하고, 해당 변수를 기반으로 한국 원으로의 환전 금액을 출력하자.
         */
        int dollar = 40;
        int won = dollar * 1300;

        if (dollar > 0) {
            System.out.println("환전 금액은 " + won + "원입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("잘못된 금액입니다.");
        }

        /* 4. 요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자.
            - 어바웃타임 - 평점9
            - 토이 스토리 - 평점8
            - 고질라 - 평점7

            * 평점 변수는 double rating을 사용하세요. if문을 활용해서 문제를 풀자.
         */
        double rating = 6;
        if (rating >=9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating >=8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (rating >= 7) {
            System.out.println("'고질라'를 추천합니다.");
        } else {
            System.out.println("평점 " + rating + "점에 해당하는 영화가 없습니다.");
        }

        /* 5. String grade라는 문자열을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자. 각 학점은 다음과 같은 성취도를 나타낸다.
            - "A" : "탁월한 성과입니다."
            - "B" : "좋은 성과입니다."
            - "C" : "준수한 성과입니다."
            - "D" : "항상이 필요합니다."
            - "F" : "불합격입니다.
            - 나머지 : "잘못된 학점입니다."

            * switch문을 사용해서 문제를 해결하자.
         */
        String grade = "A";
        switch (grade) {
            case "A" :
                System.out.println("탁월한 성과입니다.");
                break;
            case "B" :
                System.out.println("좋은 성과입니다.");
                break;
            case "C" :
                System.out.println("준수한 성과입니다.");
                break;
            case "D" :
                System.out.println("항상이 필요합니다.");
                break;
            case "F" :
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
                break;
        }

        // 6. 여러분은 두 개의 정수 변수 a와 b를 가지고 있다. a의 값은 10이고, b의 값은 20이다. 삼항 연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력하는 코드를 작성하자.
        int a = 10;
        int b = 20;
        
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);

        // 7. 정수 x가 주어지면 x가 짝수이면 "짝수"를, x가 "홀수"를 출력하는 프로그램을 작성하자 삼항 연산자를 사용해야 한다.
        int x = 11;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x는 " + result + "입니다.");


    }
}
