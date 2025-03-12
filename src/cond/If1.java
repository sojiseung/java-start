package cond;

public class If1 {
    public static void main(String[] args) {
        // if문은 조건식이 참일때 아래에 코드를 실행한다 false면 코드를 실행 안하고 다음줄로 넘김
        // else는 만족하는 조건이 없을 때 실행되는 코드
        // if else는 if문에 다른 조건을 추가할때 사용
        int age = 10;

        if (age < 0) {
            System.out.println("변수에 나이를 정확히 입력해주세요.");
        }
        else if (age >= 20) {
            System.out.println("성인입니다.");
        }
        else {
            System.out.println("미성년자입니다.");
        }



    }
}
