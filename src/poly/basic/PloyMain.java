package poly.basic;

/* 다형적 참조: 부모는 자식을 품을 수 있다. */

public class PloyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

//        Child child1 = new Parent(); // 자식은 부모를 담을 수 없다.
        // 자식의 기능은 호출할 수 없다. compile error
//        poly.childMethod();
    }
}

/* <다형적 참조>
 * 자식 타입인 Child를 생성했기 때문에 Child와 Parent 모두 생성
 * 생성된 참조값을 Parent 타입의 변수인 poly에 담아둠
 *
 * 부모는 자식을 담을 수 있다!
 * 반대로 자식 타입은 부모 타입을 담을 수 없다.
 *
 * <다형적 참조의 한계>
 * 상속 관계는 부모 방향으로 올라갈 수는 있지만 자식 방향으로 찾아 내려갈 수는 없음
 * 그래서 부모 변수인 poly가 childMethod를 호출할 때 compile error 발생
 * 만약 childMethod()를 호출하고 싶다면 '캐스팅' 필요
 */