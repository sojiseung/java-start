package method;

public class Overloading2 {

    public static void main(String[] args) {
        System.out.println("1 : " + add(1, 2)); // int add() 없으면 자동 형변환
        System.out.println("2 : " + add(1.2, 2.3));

    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
