package commandPattern;

public class Thermostat implements Buttons {
    @Override
    public String turnOn() {
        return "-----Thermostat is On-----";
    }

    @Override
    public String turnOff() {
        return "-----Thermostat is Off-----\n";
    }

    @Override
    public String increase() {
        return "-----Temperature Increase-----";
    }

    @Override
    public String decrease() {
        return "-----Temperature decrease-----";
    }
}
