package static2.ex;

public class Car {
    // 지금은 사용하지 않지만 보통 이름을 전달해주면 Car 객체의 속성을 보관해두는 것이 일반적이기 때문에 name 필드를 추가한 것
    private String name;
    private static int count;

    public Car(String name) {
        count++;
        this.name = name;
        System.out.println("차량구입, 이름: " + name);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량수: " + count);
    }
}
