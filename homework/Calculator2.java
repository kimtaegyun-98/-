public class Calculator2 {
    private int result;
    //  더하기 기능 부여: 두 정수를 더하는 메서드
    public int sum(int a, int b) {

        return  a + b;

        // 두 정수를 더하는 메서드

    }
    public int subtract (int a,int b){

        return  a - b;
        // 두 정수를 빼는 메서드

    }
    public int multiply (int a,int b){
        return a= a * b;
        // 두 정수를 곱하는 메서드


    }
    public int divide (int a,int b) {
        if (b == 0) { System.out.println("0으로 나눌 수 없습니다");
            return 0;}   // 0을 입력하면 결과 값 0으로 나오게 설정

        return a= a / b;
    }

}

//두 정수를 나누는 메서드




