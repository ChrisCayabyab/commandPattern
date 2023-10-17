package commandPattern;

public class Increase implements Command{
    private Buttons buttons;

    public Increase(Buttons buttons)
    {
        this.buttons = buttons;
    }

    @Override
    public String execute() {
        return buttons.increase();
    }
}
