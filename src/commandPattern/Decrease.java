package commandPattern;

public class Decrease implements Command{
    private Buttons buttons;

    public Decrease(Buttons buttons)
    {
        this.buttons = buttons;
    }

    @Override
    public String execute() {
        return buttons.decrease();
    }
}