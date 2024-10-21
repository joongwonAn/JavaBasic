package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 util1s = new DecoUtil1();
        String deco = util1s.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}

/* 문제점
 * deco() 메서드를 호출하기 위해서는 DecoUtil1의 인스턴스를 생성해야 한다.
 * 인스턴스가 필요한 이유는 멤버 변수(인스턴스 변수) 등을 사용하려는 목적이 큰데,
 * 이 메서드는 사용하는 인스턴스 변수도 없고 단순히 기능만 제공한다.
 */
