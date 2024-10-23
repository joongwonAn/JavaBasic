package final1;

// final 필드 - 필드 초기화
public class FieldInit {

    /* 자바 관례
     * static final이 붙으면 상수 취급해서 모두 대문자로 변수 작명
     */
    static final int CONST_VALUE = 10;
    final int value = 10;

    /* 이미 value값 초기화가 되서 못 바꿈 */
//    public FieldInit(int value) {
//        this.value = value;
//    }
}
