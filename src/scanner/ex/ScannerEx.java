package scanner.ex;

import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 사용자로부터 입력받은 이름과 나이를 출력하세요. 출력 형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살입니다."이어야 합니다.
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.print("당신의 나이를 입력하세요 : ");
        int age = scanner.nextInt();
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");

        // 2. 사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
        System.out.print("정수 하나를 입력하세요 : ");
        int num = scanner.nextInt();
        // scanner.(next, nextInt...등)는 개행문자를 받지 않는다.
        scanner.nextLine(); // 따라서 위에 num을 받고 enter를 쳤을때 \n(enter)을 받지 않았기 때문에 버퍼에 \n(개행문자)가 남아 있을것이다 그래서 \n(enter) 처리용으로 nextLine();을 밑에 넣어줘야 한다.
        if (num % 2 == 0) {
            System.out.println(num + "은 짝수 입니다.");
        } else {
            System.out.println(num + "은 홀수 입니다.");
        }

        /*
            3. 음식점 주문
            - 사용자로부터 음식의 이름( foodName ), 가격( foodPrice ), 그리고 수량( foodQuantity )을 입력받아, 주문 한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하세요.
            - 음식의 총 가격을 계산하세요. 총 가격은 각 음식의 가격( foodPrice )과 수량( foodQuantity )을 곱한 값이 며, 이를 totalPrice 라는 이름의 변수에 저장하세요.
            - 주문 정보와 총 가격을 출력하세요. 출력 형태는 "[음식 이름] [수량]개를 주문하셨습니다. 총 가격은 [총 가격]원 입니다." 이어야 합니다.
         */
        System.out.print("안녕하세요 kfg 입니다.\n음식의 이름을 적어주세요 : ");
        String foodName = scanner.nextLine();   // 위에 nextLine();으로 버퍼에 남아있던 \n(개행문자)를 처리했기때문에 사용자가 입력한 값을 온전하게 받을 수 있다.
        System.out.print("음식의 가격도 적어주세요 : ");
        int foodPrice = scanner.nextInt();
        System.out.print("음식의 수량을 입력해주세요 : ");
        int foodQuantity = scanner.nextInt();
        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원 입니다.");

        // 4. 사용자로부터 하나의 정수 n 을 입력받고, 입력받은 정수 n 의 구구단을 출력하는 프로그램을 작성하세요.
        System.out.print("정수를 입력하세요 :  ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }

        /*
            5. 변수 값 교환
            변수 a = 10이  들어있고, b = 20이 들어있다.
            변수 a의 값과 변수 b의 값을 서로 바꾸어라
            다음 코드에서 시작과 종료 부분 사이에 변수의 값을 교환하는 코드를 작성하면 된다.
            힌트 : temp변수를 활용해야 한다.
         */
        int a = 10, b = 20;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
            6. 사이 숫자
            사용자로부터 두 개의 정수를 입력받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성하세요.
            - 사용자에게 첫 번째 숫자를 입력받으세오. 변수의 이름은 num1이어야 합니다.
            - 사용자에게 두 번째 숫자를 입력받으세요. 변수의 이름은 num2이어야 합니다.
            - 만약 첫 번째 숫자 num1이 두 번째 숫자 num2보다 크다면, 두 숫자를 교환하세요.
                - 참고 : 교환을 위해 임시 변수 사용을 고려하세요.
            - num1부터 num2까지의 각 숫자를 출력하세요.
            - 출력 결과에 유의하세요. 다음 예시와 같이 2,3,4,5처럼 ,로 구분해서 출력해야 합니다.
         */

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        if (num1 > num2) {
            int x = num1;
            num1 = num2;
            num2 = x;
        }
        for (int i = num1; num2 >= i; i++) {
            System.out.print(i);
            if (num2 > i) {
                System.out.print(",");
            }
        }
        System.out.println("");
        /*
            7. 이름과 나이 반복
            - 사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램을 작성하세요.
                사용자가 "종료"를 입력하면 프로그램이 종료되어야 합니다.
            - 다음 실행 결과 예시를 참고해주세요.
                이름을 입력하세요 (종료를 입력하면 종료): 자바 나이를 입력하세요: 30
                입력한 이름: 자바, 나이: 30
                이름을 입력하세요 (종료를 입력하면 종료): 하니 나이를 입력하세요: 20
                입력한 이름: 하니, 나이: 20
                이름을 입력하세요 (종료를 입력하면 종료): 종료 프로그램을 종료합니다.
         */
        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            name = scanner.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print(name + " 나이를 입력하세요 : ");
            age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
        }
        /*
            8. 상품 가격 계산
            - 사용자로부터 상품의 가격(price)과 수량(quantity)을 입력받고, 총 비용을 출력하는 프로그램을 작성하세요.
            - 가격과 수량을 입력받은 후에는 이들의 곱을 출력하세요. 출력 형태는  "총 비용 : [곱한 결과]"이어야 합니다.
            - -1을 입력하여 가격 입력을 종료합니다.
         */
        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료합니다.) : ");
            int price = scanner.nextInt();
            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("상품의 수량을 입력하세요 : ");
            int quantity = scanner.nextInt();
            int totalcost = price * quantity;
            System.out.println("총 비용 : " + totalcost);
        }
        /*
            9. 입력한 숫자의 합계와 평균
            - 사용자로부터 여러 개의 숫자를 입력 받고, 그 숫자들의 합계와 평균을 계산하는 프로그램을 작성하세요.
                사용자는 숫자를 입력하고, 마지막에는 -1을 입력하여 숫자 입력을 종료한다고 가정합니다.
            - 모든 숫자의 입력이 끝난 후에는, 숫자들의 합계 sum과 평균 average를 출력하세요.
                평균은 소수점 아래까지 계산해야 합니다.
            - 다음 실행 결과 예시를 참고해주세요.
            예시)
                숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:
                1
                2
                3
                4
                -1
                입력한 숫자들의 합계: 10 입력한 숫자들의 평균: 2.5
         */

    }
}
