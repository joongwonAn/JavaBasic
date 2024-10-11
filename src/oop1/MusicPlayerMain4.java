package oop1;
/* 객체 지향 프로그래밍 */
/*
- 캡슐화
속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것
 */

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 끄기
        player.on();

        // 볼륨 증가
        player.volumeUp();

        // 볼륨 증가
        player.volumeUp();

        // 볼륨 감소
        player.volumeDown();

        // 음악 플레이어 상태
        player.showStatus();

        // 음악 플레이어 끄기
        player.off();
    }
}
