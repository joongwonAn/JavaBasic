package static1;

public class Data3 {
    public String name;
    /* 이렇게 멤버 변수에 static을 붙이면 static 변수, 정적 변수, 클래스 변수라 한다.
     * staic이 붙은 멤버 변수는 메서드 영역에서 관리한다.(인스턴스 영역(힙 영역)에 생성 X)
     * 메서드 영역에서 관리 = 공용 사용 가능
     *
     * 참고로 Data3의 생성자와 같이 자신의 클래스에 있는 정적 변수라면 클래스명을 생략할 수 있다.
     */
    public static int count; //static


    public Data3(String name) {
        this.name = name;
        count++;
    }
}
