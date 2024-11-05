package poly.ex5;

public interface InterfaceAnimal {
    // public abstract 생략
    void sound();
    void move();
}

/* 인터페이스
 * 순수 추상 클래스 + 편의기능
 * 1. 인터페이스의 메서드는 모두 public, abstract이다
 *    -> 메서드애 public abstarct를 생략 가능 (권장됨)
 * 2. 다중 구현(다중 상속) 지원
 */