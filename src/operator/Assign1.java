package operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3; // ( 5 + 3 ): a = a + 3
        System.out.println("a = " + a);

        a = 5;
        a -= 3; // ( 5 - 3 ): a = a - 3
        System.out.println("a = " + a);

        a = 5;
        a *= 3; // ( 5 * 3 ): a = a * 3
        System.out.println("a = " + a);

        a = 5;
        a /= 3; // ( 5 / 3 ): a = a / 3
        System.out.println("a = " + a);

        a = 5;
        a %= 3; // ( 5 % 3 ): a = a % 3
        System.out.println("a = " + a);
    }
}
