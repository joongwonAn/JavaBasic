package static2;

public class DecoUtil2 {

    // 문자열 꾸미는 기능 제공. 문자열이 들어오면 앞 뒤에 * 붙여서 반환
    // 메서드에 static -> 정적 메서드
    public static String deco(String str) {
        return "*" + str + "*";
    }
}

/* 정적 메서드는 정적 변수처럼 인스턴스 생성 없이 클래스 명을 통해 바로 호출 가능하다. */