package final1.ex;

/* 특정 변수의 값을 할당하 이후에 변경하지 않아야 한다면 final 사용!*/

public class Member {

    private final String id; // final 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
        /* final인 id값 변경을 시도하면 컴파일 오류 발생 */
//        this.id = id; // compile error
        this.name = name;
    }

    public void print() {
        System.out.println("id: " + id + ", name: " + name);
    }
}
