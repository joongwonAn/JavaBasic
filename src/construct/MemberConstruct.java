package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    //this는 생성자 코드의 첫 줄에만 작성해야 한다.
    //첫줄이 아니면 오류 발생
    MemberConstruct(String name, int age) {
        this(name, age, 50); //변경
//        this.name = name;
//        this.age = age;
//        this.grade = 15;
    }

    /* 생성자
    1. 생성자의 이름은 클래스 이름과 같아야 한다.
    2. 생성자는 반환타입이 없다.
    3. 나머지는 메서드와 같다.
     */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade:" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
