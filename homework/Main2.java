public class Main2
{
    public static void main(String[] args) {


        Person p1 = new Person(35,"koi","bald");
        Person p2 = new Person(30,"soi","permed");

        System.out.println("나이는 " + p1.getAge() + "살이고 이름은 " + p1.name
        + "이고 " + "헤어스타일은 " + p1.hairstyle + "입니다");

        System.out.println("세터 전 나이는 " + p1.getAge() + "입니다");

        p1.setAge(100);  // 세터를 활용해 나이를 100으로 수정

        System.out.println("세터 후 나이는 " + p1.getAge() + "입니다");




    }
}



