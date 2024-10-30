package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }

        /* 자바16부터 instnaceof를 사용하면서 동시에 변수 선언 가능
            if (parent instanceof Child) {
                System.out.println("Child 인스턴스 맞음");
                Child child = (Child) parent;
                child.childMethod();
            }
         */
    }
}

/* <instanceof 키워드>
 * 오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우에도 true 반환
 * == 오른쪽에 있는 타입에 왼쪽에 있는 인스턴스의 타입이 들어갈 수 있는지 대입해보면 됨
 * 대입이 가능하면 true, 블가능하면 false
 *
 * ex)
 * new Parent() instanceod Parent
 * Parent p = new Parent() // 같은 타입 true
 *
 * new Child() instanceof Parent
 * Parent p = new Child() // 부모는 자식을 담을 수 있음 true
 *
 * new Parent instanceof Child
 * Child c = new Parent() // 자식은 부모를 담을 수 없음 false
 */