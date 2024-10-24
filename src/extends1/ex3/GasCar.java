package extends1.ex3;

public class GasCar extends Car {

    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}

/* 상속: 자식이 부모의 기능을 물려 받아서 사용하는 것
 * 반대로 부모 클래스는 자식 클래스에 접근 X
 *
 * 자바는 클래스의 단일 상속만 가능하다. (extend 대상은 하나만 선택 가능)
 * 대신 이후에 인터페이스의 다중 구현을 허용
 */
