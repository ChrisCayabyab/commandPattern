package commandPattern;

public class CentralHub {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void pressButton() {
        System.out.println(command.execute());
    }
}