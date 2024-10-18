package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        // Data와 packageMain1이 같은 패키지 내에 있으므로 그냥 사용 O
        Data data = new Data();

        // 다른 위치에 있을 경우에는, 전체 경로를 작성해야 한다.
        // 이렇게 다 적는 것이 불편 -> import 사용
        pack.a.User user = new pack.a.User();
    }
}
