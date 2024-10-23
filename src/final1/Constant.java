package final1;

/* 상수(constant)
 * 변하지 않고 항상 일정한 값을 갖는 수
 * 자바에서는 보통 단 하나만 존재하는 변하지 않는 고정된 값 -> static final
 *
 * 자바 상수 특징
 * 1. static final 키워드 사용
 * 2. 대문자를 사용하고 구분은 _(언더스코어)로 함 (관례)
 *    일반적인 변수와 상수를 구분하기 위함
 * 3. 필드를 직접 접근해서 사용
 *    상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적
 *    상수는 값을 변경할 수 없으므로 필드에 직접 접근해도 데이터 변하는 문제가 발생하지 않음
 *
 * 보통 이런 상수들은 애플리케이션 전반에서 사용하므로 public을 자주 사용한다.
 * 상수는 중앙에서 값을 하나로 관리할 수 있다는 장점이 있다.
 * 상수는 런타임에서 변경할 수 없다. 상수를 변경하려면 프로그램을 종료하고 코드를 변경한 다음에 프로그램을 다시 실행해야 한다.
 */

// 상수
public class Constant {
    // 수학 상수
    public static final double PI = 3.14;

    // 시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;

    // 애플리케이션 설정 상수
    public static final int MAX_USERS = 1000;
}
