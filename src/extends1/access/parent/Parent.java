package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }
    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }
    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }
    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() {
        System.out.println("==Parent 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue); // 부모 메서드 안에서 접근 가능
        System.out.println("privateValue = " + privateValue); // 부모 메서드 안에서 접근 가능

        // 부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }
}

/* 접근제어자의 종류
 * 1. private: 모든 외부 호출을 막는다.
 * 2. default(package-private): 같은 패키지 안에서 호출은 허용한다.
 * 3. protected: 같은 패키지 안 or 상속 관계
 * 4. public: 모든 외부 호출 허용
 *
 * private > default > protected > public
 */