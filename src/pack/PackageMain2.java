package pack;

//import pack.a.User;
//import pack.a.User2;
//*사용: 패키지에 있는 모든 클래스 불러 쓸 수 있음
import pack.a.*;

public class PackageMain2 {

    public static void main(String[] args) {
        // Data와 packageMain1이 같은 패키지 내에 있으므로 그냥 사용 O
        Data data = new Data();

        // import 사용
        User user = new pack.a.User();
        User2 user2 = new pack.a.User2();
    }
}
