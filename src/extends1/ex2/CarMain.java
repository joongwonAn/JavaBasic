package extends1.ex2;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}

/* 중요!) 상속과 메모리 구조
 * new ElectricCar()를 호출하면 ElectricCar와 상속 관계에 있는 Car까지 인스턴스를 생성한다.
 * 참조값은 하나이지만 실제로 그 안에는 Car와 ElectricCar라는 두 가지 클래스 정보가 공존하는 것.
 *
 * 1. electricCar.charge(); 호출
 *    참조 값을 확인해서 x001.charge를 호출한다.
 *    내부에 부모와 자식이 모두 존재하므로 어디부터 찾을지 고민해야 한다.
 *    이때는 호출하는 변수의 타입(클래스)를 기준으로 선택한다.
 *    electricCar 변수의 타입인 ElectricCar를 통해 charge()를 호출한다.
 *
 * 2. electricCar.move(); 호출
 *    호출하는 변수인 electricCar의 타입이 ElectricCar이므로 이 타입을 선택한다.
 *    그런데 ElectricCar에는 move() 메서드가 없다.
 *    상속 관계인 경우 자식 타입에 해당 기능이 없으면 부모 타입으로 올라가서 찾는다.
 *    이 경우 ElectricCar의 부모인 Car로 올라가서 move()를 찾는다.
 *    부모인 Car에 move()가 있으므로 부모에 있는 move() 메서드를 호출한다.
 *
 *    만약 부모에서도 해당 기능을 찾지 못하면 더 상위 부모에서 필요한 기능을 찾아본다.
 *    부모에 부모로 계속 올라가면서 필드나 메서드를 찾는다.
 *    물론 계속 찾아도 없으면 컴파일 오류가 발생한다.
 *
 *
 * => 정리
 * 1. 상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 부모 생성된다.
 * 2. 상속 관계의 객체를 호출할 때, 대상 타입을 정해야 한다.
 *    이때 호출자의 타입을 통해 대상 타입을 찾는다.
 * 3. 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행한다.
 *    기능을 찾지 못하면 컴파일 오류가 발생한다.
 */