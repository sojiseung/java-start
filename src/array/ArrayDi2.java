package array;

public class ArrayDi2 {

    public static void main(String[] args) {
        // 2X3 2차원 배열을 만든다.
        int[][] arr = new int[][]{
                {1,2,3},
                {4,5,6}
        };

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column <= 2; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println("");
        }
    }
}
