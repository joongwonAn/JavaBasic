package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        /* 각 인스턴스마다 final 필드에 다른 값 할당 가능 (생성 이후 값 변경은 불가) */
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        /* 생성자 초기화와 다르게 필드 초기화는 필드의 코드에 해당 값이 미리 정해져 있다.
         * 모든 인스턴스가 같은 값을 사용하기 때문에 메모리 낭비하게 된다.
         * 그리고 같은 값이 계속 생성되는 것은 너무나 명확한 중복
         *
         * => static 사용 (static final)
         */
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        /* FieldInit.CONST_VALUE은 static 영역에 존재하며, final 키워드를 사용해서 초기화 값이 변하지 않는다.
         * static 영역은 단 하나만 존재하는 영역이므로 앞서 설명한 중복과 메모리 비효율 문제 모두 해결 가능
         *
         * -> final + 필드 초기화를 사용하는 경우 static을 붙여서 사용하는 것이 효과적
        */
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
