package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[]{90,80,70,60,50};   // 배열 생성과 초기화

        for (int i = 0; i < students.length; i++) { // length 배열의 길이를 제공하는 특별한 기능
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }

    }
}
