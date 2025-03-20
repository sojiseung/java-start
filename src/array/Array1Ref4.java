package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90,80,70,60,50};   // 생략은 가능한데 선언과 초기화를 같이 해줘야됨

        for (int i = 0; i < students.length; i++) { // length 배열의 길이를 제공하는 특별한 기능
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }

    }
}
