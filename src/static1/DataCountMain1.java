package static1;

/* new를 사용해서 이전 인스턴스와는 관계 없는 새로운 인스턴스를 생성한다.
 * 새로운 인스턴스의 count 값은 0으로 초기화된다.
 * 그래서 모든 count 값이 1이 된다.
 *
 * 인스턴스에 사용되는 멤버 변수 count 값은 인스터스끼리 서로 공유되지 않는다.
 * 따라서 원하는 답을 구할 수 없다.
 * 이 문제를 해결하려면 변수를 서로 공유해야 한다.
 */

public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data3.count);
    }
}
