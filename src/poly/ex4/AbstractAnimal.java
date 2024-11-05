package poly.ex4;

public abstract class AbstractAnimal {

    public abstract void sound();
    public abstract void move();
}

/* 순수 추상 클래스
 * 실행 로직을 전혀 가지고 있지 않고,
 * 단지 다형성을 위한 부모 타입으로써 껍데기 역할만 제공
 *
 * 순수 추상 클래스 특징
 * 1. 인스턴스를 생설할 수 없다.
 * 2. 상속 시 자식은 모든 메서드를 오버라이딩해야 한다.
 * 3. 주로 다형성을 위해 사용된다.
 * 
 * => 마치 규격에 맞추어 구현해야 되는 느낌
 */