package poly.ex5;

/* extends 대신에 implement라는 '구현' 키워드 사용
 * 인터페이스는 상속이라 하지 않고 구현이라 함
 *
 * 인터페이스는 메서드 이름만 있는 설계도이고,
 * 이 설계도가 실제 어떻게 작동하는지는 하위 클래스에서 모두 구현해야 함
 *
 * 인터페이스를 사용해야 하는 이유
 * 1. 제약
 *    : 인터페이스를 구현하는 곳에서 인터페이스의 메서드를 반드시 구현하라는 규약(제약)을 주는 것
 *      순수 추상 클래스는 미래에 누군가 그곳에 실행 가능한 메서드를 끼워넣어 문제가 생길 수 있음
 * 2. 다중 구현
 *    : 자바에서 클래스 상속은 부모를 하나만 지정할 수 있음
 *      반면, 인터페이스는 부모를 여러명 두는 다중 구현(다중 상속)이 가능함
 */
public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
