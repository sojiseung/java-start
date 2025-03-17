package casting;

public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);
        // 값은 1
        
        double div2 = 3 / 2;
        System.out.println("div2 = " + div2);
        // 1 -> 1.0 1을 double로 형변환 
        
        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3);
        // 1.5 -> 1.5 3.0 double 나누기 int로 계산 double로 값이 출력
        
        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);
        // 3을 double로 형변환 후 계산 나머지는 위와 같음
        
        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);
    }
}
