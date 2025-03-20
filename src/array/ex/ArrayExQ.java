package array.ex;

import java.util.Scanner;

public class ArrayExQ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. 배열을 사용해서 개선하기
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;

        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        double average = (double) total / students.length;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + average);

        /*
            2. 배열의 입력과 출력
            사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자.
            출력시 출력 포멧은 1,2,3,4,5와 같이 , 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
         */
        int[] number2 = new int[5];

        System.out.println("정수 5개를 입력해주세요!!");
        for (int i = 0; number2.length > i; i++) {
            number2[i] = scanner.nextInt();
        }
        for (int i = 0; number2.length > i; i++) {
            System.out.print(number2[i]);
            if (number2.length - 1 > i) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        /*
            3. 배열과 역순 출력
            사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서인 반대인 역순으로 출력하자.
            출력시 출력 포멧은 5,4,3,2,1과 같이 ,쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
         */
        int[] number3 = new int[5];

        System.out.println("정수 5개를 입력해주세요!!");
        for (int i = 0; number3.length > i; i++) {
            number3[i] = scanner.nextInt();
        }

        // 내가 푼 문제
//        for (int i = 0; number3.length > i; i++) {
//            System.out.print(number3[(number3.length -1) - i]);
//            if (number3.length - 1 > i) {
//                System.out.print(", ");
//            }
//        }

        // i-- 활용
        for (int i = (number3.length - 1); i > -1; i--) {
            System.out.print(number3[i]);
            if (-1 != (i -1)) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        // 4. 사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
        total = 0;
        int[] number4 = new int[5];

        System.out.println("5개의 정수를 입력해주세요.");
        for (int i = 0; number4.length > i; i++) {
            number4[i] = scanner.nextInt();
        }
        for (int number : number4) {
            total += number;
        }
        System.out.println("입력한 정수의 합계 : " + total);
        System.out.println("입력한 정수의 평균 : " + (double) total / number4.length);

        //  5. 합계와 평균2
//            이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = scanner.nextInt();
        int[] number5 = new int[count];

        System.out.println(count + "개의 정수를 입력해주세요.");
        for (int i = 0; number5.length > i; i++) {
            number5[i] = scanner.nextInt();
        }
        for (int number : number5) {
            total += number;
        }
        System.out.println("입력한 정수의 합계 : " + total);
        System.out.println("입력한 정수의 평균 : " + (double) total / number5.length);

        /*
            6. 가장 작은 수, 큰 수 찾기
            사용자로부터 n개의 정수를 입력바아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를
            찾아 출력하는 프로그램을 작성하자. 실행 결과 예시를 참고하자.
         */

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        count = scanner.nextInt();
        int[] number6 = new int[count];

        int max = 0, min = 0;
        System.out.println(count + "개의 정수를 입력하세요.");
        for (int i = 0; number6.length > i; i++) {
            number6[i] = scanner.nextInt();
            if (i == 0){
                max = number6[i];
                min = number6[i];
            }
            if (max < number6[i]) {
                max = number6[i];
            }
            if (min > number6[i]) {
                min = number6[i];
            }
        }
        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);

        /*
            7. 2차원 배열1
            사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
            2차원 배열을 사용하고, 실행 결과 예시를 참고하자
         */
        int[][] student = new int[4][3];
        //  String[] subjects = {"국어", "영어", "수학"}; 과목도 배열을 만들면 나중에 과목이 추가될때 편해짐

        for (int i = 0; student.length > i; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");
            System.out.print("국어 점수 : ");
            student[i][0] = scanner.nextInt();
            System.out.print("영어 점수 : ");
            student[i][1] = scanner.nextInt();
            System.out.print("수학 점수 : ");
            student[i][2] = scanner.nextInt();
        }

        for (int i = 0; student.length > i; i++) {
            total = 0;
            for (int j = 0; student[i].length > j; j++) {
                total += student[i][j];
            }
            System.out.println((i+1) + "번 학생의 총점 : " + total + ", 평균 : " + (double) total / student[i].length);
        }

        // 8. 이전 문제에서 학생수를 입력받도록 개선하자.
        System.out.print("학생수를 입력하세요 : ");
        count = scanner.nextInt();
        String[] sub = {"국어", "영어", "수학"};

        int[][] stu = new int[count][sub.length];

        for (int i = 0; stu.length > i; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");
            for (int j = 0; sub.length > j; j++) {
                System.out.print(sub[j] + "점수 : ");
                stu[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; stu.length > i; i++) {
            total = 0;
            for (int j = 0; stu[i].length > j; j++) {
                total += stu[i][j];
            }
            System.out.println((i+1) + "번 학생의 총점 : " + total + ", 평균 : " + (double) total / stu[i].length);
        }
    }
}
