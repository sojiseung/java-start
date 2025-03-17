package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647;  // int 최고값
        long maxIntOver = 2147483648L;  // int 최고값 + 1(초과)
        int intValue = 0;
        
        intValue = (int) 2147483647;    //형변환
        System.out.println("intValue = " + intValue);
        
        intValue = (int) maxIntOver;    //형변환
        System.out.println("maxIntOver casting = " + intValue); // int에 가장 작은 값을 출력 오버플로우
        // 시계가 한바퀴 돈 것 처럼 처음부터 다시 시작
    }
}
