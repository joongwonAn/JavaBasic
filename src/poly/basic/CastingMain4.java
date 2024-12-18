package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.childMethod(); // 실행 불가
    }
}

/* parent2는 부모 타입으로 객체 생성 -> 메모리 상에 Child 존재 X
 * 다운캐스팅 후 childMethod()를 호출 불가
 *
 * <업캐스팅은 안전하고 다운캐스팅은 위험한 이유>
  * 업캐스팅의 경우 객체를 생성하면 해당 타입의 상위 부모 타입은 모두 생성되기 때문에 문제 X
  * 반면 다운캐스팅은 인스턴스에 존재하지 않는 하위 타입으로 캐스팅하는 문제 발생 가능
  * 따라서 개발자가 이런 문제를 인지하고 사용해야 한다는 의미로 명시적 캐스팅을 해주어야 함
  *
  * <컴파일 오류 vs 런타임 오류>
   * 컴파일 오류는 변수명 오타, 잘못된 클래스 이름 사용 등 자바 프로그램을 실행하기 전에 발생하는 오류
   * -> IDE에서 즉시 확인가능하므로 안전하고 좋은 오류
   * 런타임 오류는 프로그램이 실행되고 있는 시점에 발생하는 오류
   * -> 매우 안좋은 오류, 보통 고객이 프로그램이 실행하는 도중에 발생하기 떄문
 */