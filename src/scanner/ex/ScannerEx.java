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

    }
}
