package extends1.overriding;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}

/* 오버로딩(Overloading)과 오버라이딩(Overriding)
 * 1. 메서드 오버로딩
 *    : 메서드 이름이 같고 매개변수(파라미터)가 다른 메서드를 여러개 정의하는 것
 * 2. 메서드 오버라이딩 = 메서드 재정의
 *    : 하위 클래스에서 상위 클래스의 메서드를 재정의하는 과정
 *      부모의 기능을 자식이 다시 정의하는 것
 */

/* 메서드 오버라이딩 조건
 * 1. 메서드 이름 : 메서드 이름이 같아야 함
 * 2. 메서드 매개변수(파라미터) : 파라미터의 타입, 순서, 개수가 같아야 함
 * 3. 반환 타입 :  반환 타입이 같아야 함. 단 반환타입이 하위 클래스 타입일 수 있음
 * 4. 접근 제어자 : 오버라이딩 메서드의 접근 제어자는 상위 클래스의 메서드보다 더 제한적이어서는 안됨
 * 5. static, final, private : 키워드가 붙은 메서드는 오버라이딩이 될 수 없음
 * 6. 생성자 오버라이딩
 * 7. 예외 : 오버라이딩 메서드는 상위 클래스의 메서드보다 더 많은 체크 예외를 throw로 선언할 수 없음
 *          하지만 더 적거나 같은 수의 예외 또는 하위 타입의 예외는 선언할 수 음
 *          -> 뒤에서 학습
 */