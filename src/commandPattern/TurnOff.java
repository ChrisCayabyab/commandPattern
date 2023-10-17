package commandPattern;

public class TurnOff implements Command{

    private Buttons buttons;

    public TurnOff(Buttons buttons)
    {
        this.buttons=buttons;
    }
    @Override
    public String execute() {
        return buttons.turnOff();
    }
}
