package access;

public class SpeakerMain {

    public static void main(String[] args) {
        // ctrl+B : 해당 클래스로 이동
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
/*        System.out.println("volume 필드 직접 접근 수정");
        speaker.volume = 200;
        speaker.showVolume();*/
        //Speaker에서 volume이 private로 되어 있어서 접근 불가
    }
}
