package homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);    // 스캐너로 입력값 받음
        System.out.println("첫 번째 숫자를 입력해주세요: ");  // 첫 번째 숫자 입력
        int A = scanner.nextInt();

        while (true) {
            System.out.println("사칙 연산 기호(+ - * /)를 입력해주세요: (계산기를 종료하려면 exit 입력)"); // 사칙 연산 기호 입력 받음

            String C = scanner.next();

            if (C.equals("exit"))       // exit 입력시 종료
                break;


            System.out.println("두 번째 숫자를 입력해주세요: ");  // 두 번째 숫자 입력
            int B = scanner.nextInt();


            if (C.equals("+")) {
                A = A + B ;


            } else if (C.equals("-")) {
                A = A - B ;
            } else if (C.equals("*")) {
                A = A * B ;

            } else if (C.equals("/")) {
                if (B != 0) {
                    A = A / B ;


                } else System.out.println("0으로 나눌 수 없습니다");
            }

            System.out.println("결과 값 : " + A);
        }







    }

}



