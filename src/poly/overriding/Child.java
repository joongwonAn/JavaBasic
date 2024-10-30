package poly.overriding;

public class Child extends Parent {

    public String value = "child";

    // [ctrl + o] 단축키
    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
