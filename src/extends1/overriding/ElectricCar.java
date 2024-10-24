package extends1.overriding;

public class ElectricCar extends Car {

    /* ElectricCar는 부모 Car의 move 기능을 그대로 사용하지 않고,
     * 메서드 이름은 같지만 새로운 기능을 사용하고 싶다.
     * -> 오버 라이딩: 부모의 기능을 자식이 새로 정의하는 것
     */
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    public void charge() {
        System.out.println("충전합니다.");
    }
}

/* @(애노테이션): 프로그램이 읽을 수 있는 특별한 주석
 * @Override: 상위 클래스의 메서드를 오버라이드하는 것임을 나타냄
 */