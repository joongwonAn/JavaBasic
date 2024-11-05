package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {

        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}

/* 자바는 다중 상속을 지원하지 않으므로 extends 대상은 하나만 선택 가능했음
 * 다이아몬드 문제로 인해  다중 상속을 사용하면 클래스 계층 구조가 매우 복잡해질수 있으므로 금했음
 * *다이아몬드 문제 : 상속 관계에서 두 부모 중 어떤 부모의 메서드를 사용해야할지 결정해야 하는 것
 *
 * 대신 인터페이스의 다중 구현을 허용하여 이런 문제를 피함
 * 인터페이스는 모두 추상 메서드로 이루어져 있기에 가능
 */