package static1;

public class Data2 {
    public String name;

    public Data2(String name, Counter counter) {
        this.name = name;
        /* 생성자가 호출되면 counter 인스턴스에 있는 count 변수의 값을 하나 증가시킨다. */
        counter.count++;
    }
}
