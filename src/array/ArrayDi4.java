package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2X3 2차원 배열을 만든다.
        int[][] arr = new int[2][4];

        // 2차원 배열 초기화 반복문 사용
        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {    // arr.length는 {}를 확인
            for (int column = 0; column < arr[row].length; column++) {  // arr[row].length는 {}안에 내용을 확인
                System.out.print(arr[row][column] + " ");
            }
            System.out.println("");
        }
    }
}
