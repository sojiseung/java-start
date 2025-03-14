package loop;

public class While_1 {
    public static void main(String[] args) {
        int count = 0;

        count = count + 1;
        System.out.println("현재 숫자는 : " + count);
        count = count + 1;
        System.out.println("현재 숫자는 : " + count);
        count = count + 1;
        System.out.println("현재 숫자는 : " + count);

        // while1
        int count1 = 0;
        while (count1 < 10) {
            count1++;
            System.out.println("현재 count1 = " + count1);
        }

        // while2
        int sum = 0, i = 1, endNum = 3;

        while (i <= endNum) {
            sum += i;
            System.out.println("sum = " + sum + ", " + "i = " + i);
            i++;
        }

    }
}
