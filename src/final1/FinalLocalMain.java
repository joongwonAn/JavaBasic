package final1;

/* final
 * 1. final을 지역 변수에 설정할 경우 최초 한번만 할당 가능
 *    이후에 변수의 값을 변경하면 컴파일 오류 발생
 * 2. final을 지역 변수 선언하면서 바로 초기화한 경우 이미 값이 할당되었기 때문에 값 할당 불가능
 * 3. 매개변수에 final이 붙으면 메서드 내부에서 매개변수의 값 변경 X
 *    따라서 메서드 호출 시점에 사용된 값이 끝까지 사용된다.
 */
public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수1
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20; // compile error

        //final 지역 변수2
        final int data2 = 10;
//        data1 = 20; // compile error

        method(10);
    }

    // final 매개변수
    static void method(final int parameter) {
//        parameter = 20; // compile error
    }
}
