package final1;

public class ConstantMain2 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수: " + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참가합니다.");
        }
    }
}

/* 이 코드의 문제점
 * 1. 만약 프로그램 최대 참여자 수를 변경해야 하면 2곳의 변경 포인트 발생
 *    만약 애플리케이션의 100곳에서 이 숫자를 사용했다면 100곳을 모두 변경해야 함
 * 2. 매직 넘버 문제 발생
 *    숫자 1000이라는 건 무슨 뜻일까? 값만 보고 이해하기 어렵다.
 */
