package commandPattern;

public class TurnOn implements Command{

    private Buttons buttons;

    public TurnOn(Buttons buttons)
    {
        this.buttons=buttons;
    }
    @Override
    public String execute() {
        return buttons.turnOn();
    }
}