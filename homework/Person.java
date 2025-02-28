

public class Person {
     // Person 속성
   private int age;
    String name;
    String hairstyle;




  // 생성자

  public Person (int age,String name,String hairstyle)
  {   this.age = age;
      this.name = name;
      this.hairstyle =hairstyle;
  }

  // age의 게터 메서드
  public int getAge(){
      return age;
  }

  // age의 세터 메서드 기능 추가
 public void setAge(int age){
      this.age = age;
 }


}