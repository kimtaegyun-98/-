import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculator2 클래스의 객체 생성
        Calculator2 cal = new Calculator2();

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력해주세요: "); // 첫 번째 정수 입력 받음
        int a = sc.nextInt();
        while (true) {
            System.out.println("연산기호(+ - * /)를 입력해주세요 멈추려면 exit를 입력하세요: ");
            String arith = sc.next();
            if (arith.equals("exit"))
                break;                 // exit 입력하면 계산기 종료 됨
            System.out.println("두 번째 정수를 입력해주세요: ");  // 두 번째 정수 입력
            int b = sc.nextInt();
            int result = a;              // 저장된 결과 값 a
            if (arith.equals("+")) {    // + 입력시 더하기 메서드를 불러옴
                result = cal.sum(a, b);
            }

           else if (arith.equals("-")) {     // - 입력시 빼기 메서드를 불러옴
                result = cal.subtract(a, b);
            }
           else if (arith.equals("*")) {      // * 입력시 곱하기 메서드를 불러옴
                result = cal.multiply(a, b);
            }
            else if   (arith.equals("/")) {   //  / 입력시 나누기 메서드를 불러옴
                result = cal.divide(a, b);
            }

            System.out.println("결과값 : " + result);
           a = result;        // 결과값을 a에 저장하여 다음 연산에 활용


        }
    }
}