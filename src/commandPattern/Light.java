package commandPattern;

public class Light implements Buttons {
    @Override
    public String turnOn() {
        return "-----Light is On-----";
    }

    @Override
    public String turnOff() {
        return "-----Light is Off-----\n";
    }

    @Override
    public String increase() {
        return "-----Brightness increased-----";
    }

    @Override
    public String decrease() {
        return "-----Brightness decreased-----";
    }
}
