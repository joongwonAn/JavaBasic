package extends1.ex1;

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

/* 전기차(ElectricCar)와 가솔린차(GasCar)를 만들었다.
 * 전기차는 이동(move()), 충전(charge()) 기능이 있고,
 * 가솔린차는 이동(move()), 주유(fillUp()) 기능이 있다.
 *
 * 전기차, 가솔린차 < 차(Car)
 * 전기차와 가솔린차의 공통점: 이동(move())
 *
 * -> 상속 관계 이용!!
 */