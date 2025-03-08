package kioskhomework;



public class MenuItem {
        String name;          // 속성 만들기 :이름, 가격, 설명
        int price;
        String explanation;


        MenuItem(String name, int price, String explanation)
        {this.name = name;
        this.price = price;
        this.explanation =explanation;

        }

                @Override
                public String toString() {
                return name + " - " + price + "원: " + explanation;


        }







}













