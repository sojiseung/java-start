package method.ex;

import java.util.Scanner;

public class MethodEx2Q {

    public static void main(String[] args) {
    /*
        - 다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복수행하는 프로그램을 작성하자
        또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자.
        - 출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.
     */
        Scanner scanner = new Scanner(System.in);
        int depositAmount;
        int withdrawAmount;
        int balance = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택 : ");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.print("입금액을 입력하세요 : ");
                depositAmount = scanner.nextInt();
                scanner.nextLine();

                balance = dep(balance, depositAmount);

            } else if (option == 2) {
                System.out.print("출금액을 입력하세요 : ");
                withdrawAmount = scanner.nextInt();
                scanner.nextLine();

                balance = with(balance, withdrawAmount);

            } else if (option == 3) {
                System.out.println("현재 잔액 : " + balance + "원");
            } else if (option == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }

    }

    // 입금
    public static int dep(int balance, int a) {
        balance += a;
        System.out.println(a + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }

    // 출금
    public static int with(int balance, int a) {
        if (balance >= a) {
            balance -= a;
            System.out.println(a + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println(a + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
