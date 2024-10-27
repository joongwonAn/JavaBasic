package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속관계 or 같은 페이지
//        defaultValue = 1; // 다른 패키지 접근 불가, 컴파일 오류
//        privateValue = 1; // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속관계 or 같은 페이지
//        defaultMehod(); // 다른 패키지 접근 불가, 컴파일 오류
//        privateMethod(); // 접근 불가, 컴파일 오류

        printParent();
    }
}

/* Child.call() -> Parent.printParent()
 * Child는 부모의 public, protected 필드나 메서드만 접근 가능
 * Parent.printParent는 Parent 안에 있는 메서드이기 때문에 Parent 자신의 모든 필드와 메서드에 얼마든지 접근 가능
*/