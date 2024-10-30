package poly.overriding;

/* 주의!) 오버라이딩된 메서드가 항상 우선권을 가짐! */
public class OverridingMain {

    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value =" + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value =" + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value =" + poly.value); // 변수는 오버라이딩 X
        poly.method(); // 메서드 오버라이딩!
    }
}

/* poly 변수는 Parent 타입이므로 poly.value, poly.method() 를 호출하면 인스턴스의 Parent 타입에서 기능을 찾음
 * poly.value: Parent 타입에 있는 value 값 읽음
 * poly.method(): Parent 타입에 있는 method()를 실행하려 함
 *                근데 하위 타입인 Child.method()가 오버라이딩 되어 있음
 *                오버라이딩된 메서드는 항상 우선권을 가짐!!
 *                따라서 Parent.method()가 아닌 Child.method()가 실행됨
 */