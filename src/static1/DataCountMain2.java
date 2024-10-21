package static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);
    }
}

/* Counter 인스턴스를 공용으로 사용해서 객체를 생성할 때마다 값을 증가시킬 수 있다.
 * 하지만 여기에는 불편한 점이 존재한다.
 * 1. Data2가 생성된 개수를 세기 위한 Data2 클래스와 관련된 일이라 Data2 클래스 안에서 끝내고 싶은데,
 *    Counter라는 별도의 클래스를 추가로 생성해야 한다.
 * 2. 생성자의 매개변수가 추가되고 복잡해진다. 따라서 생성자 호출도 복잡해진다.
 *
 * => static 키워드 사용으로 해결!!
*/

