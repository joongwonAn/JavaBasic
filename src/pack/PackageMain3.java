package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        //같은 이름의 클래스가 있다면 import는 둘 중에 하나만 선택
        //-> 자주 사용하는 것을 import해서 사용
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
