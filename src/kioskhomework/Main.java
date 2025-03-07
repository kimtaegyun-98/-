package kioskhomework;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        List<Menuitem> menuitem = new ArrayList<>();
        menuitem.add(new Menuitem("불고기버거",4500,"한국인의 입맛에 딱 맞는 불고기 소스에 신선한 양상추의 맛있는 조합의 불고기버거"));
        menuitem.add(new Menuitem("새우버거",4500,"탱~글한 통새우살 가득~ 새우 버거!"));
        menuitem.add(new Menuitem("치킨버거",4500,"고소한 화이트 마요 소스와 아삭한 양상추가 함께 치킨버거!"));
        menuitem.add(new Menuitem("치즈버거",4500,"고소하고 부드러운 치즈와 100% 순 쇠고기 패티, 맥도날드만의 심플한 클래식 치즈버거"));


        





        Scanner scanner = new Scanner(System.in);    // 스캐너 호출

        System.out.println("[ MCDONALD MENU ]");
        System.out.println("1. 불고기버거   | w 4500 | 한국인의 입맛에 딱 맞는 불고기 소스에 신선한 양상추의 맛있는 조합의 불고기버거.");
        System.out.println("2. 새우버거   | w 5500 | 탱~글한 통새우살 가득~ 새우 버거!");
        System.out.println("3. 치킨버거   | w 5500 | 고소한 화이트 마요 소스와 아삭한 양상추가 함께 치킨버거!");
        System.out.println("4. 치즈버거    | w 4500 | 고소하고 부드러운 치즈와 100% 순 쇠고기 패티, 맥도날드만의 심플한 클래식 치즈버거.");
        System.out.println("0. 종료       | 종료");

        System.out.println("주문하실 햄버거 번호를 입력해 주세요");

        while (true){

        int number = scanner.nextInt();// 주문할 햄버거 번호 입력 받기



        switch (number) {
            case 1:
                System.out.println("| w 4500 | " + "불고기버거 메뉴를 선택하셨습니다");
                break;
            case 2:
                System.out.println("| w 5500 | " + "새우버거 메뉴를 선택하셨습니다");
                break;

            case 3:
                System.out.println("| w 5500 | " + "치킨버거 메뉴를 선택하셨습니다");
                break;

            case 4:
                System.out.println("| w 4500 | " + "치즈버거 메뉴를 선택하셨습니다");
                break;
            default:
            System.out.println("잘못된 입력입니다. 1~4 사이의 숫자를 입력해 주세요.");
        }
        if (number==0){
            System.out.println("키오스크를 종료합니다");
            return;
        }

        }


















    }
           }
