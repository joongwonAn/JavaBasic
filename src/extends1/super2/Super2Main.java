package extends1.super2;

public class Super2Main {

    public static void main(String[] args) {
        ClassC classC = new ClassC();
    }
}

/* 상속관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야 한다. (규칙)
 *
 * 상속 관계의 생성자 호출은 결과적으로 부모 -> 자식 순
 *
 */