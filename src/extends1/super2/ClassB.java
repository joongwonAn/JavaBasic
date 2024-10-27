package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}

/* 생성자의 첫줄에 super(...) 또는 this(...) 사용
 * 하지만 언젠가는 반드시 자식의 생성자 안에서 super()를 호출해야 한다.
 *
 * 부모 클래스의 생성자가 기본 생성자(파라미터가 없는 생성자)인 경우에는 super()를 생략할 수 있다.
 * 상속 관계에서 super()를 생략하면 자바는 부모의 기본 생성자를 호출하는 super()를 자동으로 만들어준다.
 */