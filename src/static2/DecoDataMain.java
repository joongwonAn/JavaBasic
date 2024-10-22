package static2;

//import static static2.DecoData.*;
//import static static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        /* static import
         * 정적 메서드를 사용할 때 해당 메서드를 아래와 같이 자주 호출해야 한다며 static import 기능을 고려하자
         * staticCall(); 로 호출이 가능해진다.
        */
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData dat21 = new DecoData();
        dat21.instanceCall();
    }
}
