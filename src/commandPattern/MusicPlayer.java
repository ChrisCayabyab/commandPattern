package commandPattern;

public class MusicPlayer implements Buttons{
    @Override
    public String turnOn() {
        return "-----MusicPlayer is On-----";
    }
    @Override
    public String turnOff() {
        return "-----MusicPlayer is Off-----\n";
    }

    @Override
    public String increase() {
        return "-----Volume increase-----";
    }

    @Override
    public String decrease() {
        return "-----Volume decrease-----";
    }
}
