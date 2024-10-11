package oop1;
/* 절차지향 프로그래밍3 - 메서드 묶음, 모듈화 */

/*
절차지향 프로그래밍의 한계
1. 데이터와 기능이 분리되어 있다.
음악 플레이어와 관련된 데이터는 'MusicPlayerData'를 사용하고,
음악 플레이어와 관련된 기능은 'MusicPlayerMain3'의 각 메서드를 사용해야 한다.

데이터와 데이터를 사용하는 메서드는 밀접한 관계가 있다.
따라서 이후에 관련 데이터가 변경이 되면 메서드도 함께 변경해야하는 번거로움이 있다.

이것을 해결하기 위해 객체 지향 프로그래밍이 나왔다.
*/
public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 끄기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
