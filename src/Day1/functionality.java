package Day1;

public class functionality implements power,volume,play {
    @Override
    public void musicPlay() {
        System.out.println("music plays");
    }

    @Override
    public void musicPause() {
        System.out.println("music pause");
    }

    @Override
    public void powerOn() {
        System.out.println("speaker ON");
    }

    @Override
    public void powerOff() {
        System.out.println("speaker OFF");
    }

    @Override
    public void volumeUp() {
        System.out.println("volume increase");
    }

    @Override
    public void volumeDown() {
        System.out.println("volume decrease");
    }

    @Override
    public void volumeMute() {
        System.out.println("volume mute");
    }
}
