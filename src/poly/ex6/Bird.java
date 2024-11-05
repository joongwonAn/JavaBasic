package poly.ex6;


/* extends를 통한 상속은 하나만 할 수 있고, implements를 통한 인테페이스는 다중 구현할 수 있기 때문에
 * 둘이 함께 나온 경우 extends - implements순으로 작성해야 한다.
 */

public class Bird extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("짹짹");        
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
