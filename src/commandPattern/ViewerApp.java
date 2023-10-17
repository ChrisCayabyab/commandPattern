package commandPattern;

import java.util.Scanner;

public class ViewerApp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        CentralHub centralHub = new CentralHub();

        Buttons thermostat = new Thermostat();
        Buttons light = new Light();
        Buttons musicPlayer = new MusicPlayer();

        boolean replayOutside=true;
        char choice, option;
        while (replayOutside) {
            boolean replay = true;
            System.out.print("[1]:Thermostat\n" +
                    "[2]:Light\n" +
                    "[3]:MusicPlayer\n" +
                    "[4]:End program\n" +
                    "What device would you like to turn on?");

            choice = scanner.next().charAt(0);
            switch (choice) {
                case '1':
                    TurnOn thermostatOn = new TurnOn(thermostat);
                    centralHub.setCommand(thermostatOn);
                    centralHub.pressButton();

                    while (replay) {
                        System.out.println("\n\n[1]:Thermostat Increase\n[2]:Thermostat Decrease\n[3]:turn off Thermostat");
                        System.out.print("\nWhat would you like to to do?:");
                        option = scanner.next().charAt(0);
                        switch (option) {
                            case '1':
                                Increase tempIncrease = new Increase(thermostat);
                                centralHub.setCommand(tempIncrease);
                                centralHub.pressButton();
                                break;
                            case '2':
                                Decrease tempdecrease = new Decrease(thermostat);
                                centralHub.setCommand(tempdecrease);
                                centralHub.pressButton();
                                break;
                            case '3':
                                TurnOff thermostatOff = new TurnOff(thermostat);
                                centralHub.setCommand(thermostatOff);
                                centralHub.pressButton();
                                replay =false;
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;
                case '2':
                    TurnOn lightOn = new TurnOn(light);
                    centralHub.setCommand(lightOn);
                    centralHub.pressButton();

                    while (replay) {
                        System.out.println("\n\n[1]:Brightness Increase\n[2]:Brightness Decrease\n[3]:turn off Light");
                        System.out.print("\nWhat would you like to to do?:");
                        option = scanner.next().charAt(0);
                        switch (option) {
                            case '1':
                                Increase brightIncrease = new Increase(light);
                                centralHub.setCommand(brightIncrease);
                                centralHub.pressButton();
                                break;
                            case '2':
                                Decrease brightdecrease = new Decrease(light);
                                centralHub.setCommand(brightdecrease);
                                centralHub.pressButton();
                                break;
                            case '3':
                                TurnOff lightOff = new TurnOff(light);
                                centralHub.setCommand(lightOff);
                                centralHub.pressButton();
                                replay =false;
                                break;

                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;
                case '3':
                    TurnOn musicPlayerOn = new TurnOn(musicPlayer);
                    centralHub.setCommand(musicPlayerOn);
                    centralHub.pressButton();

                    while (replay) {
                        System.out.println("\n\n[1]:Volume Increase\n[2]:Temperature Decrease\n[3]:turn off Music PLayer");
                        System.out.print("\nWhat would you like to to do?:");
                        option = scanner.next().charAt(0);
                        switch (option) {
                            case '1':
                                Increase volIncrease = new Increase(musicPlayer);
                                centralHub.setCommand(volIncrease);
                                centralHub.pressButton();
                                break;
                            case '2':
                                Decrease volDecrease = new Decrease(musicPlayer);
                                centralHub.setCommand(volDecrease);
                                centralHub.pressButton();
                                break;
                            case '3':
                                TurnOff musicPlayerOff = new TurnOff(musicPlayer);
                                centralHub.setCommand(musicPlayerOff);
                                centralHub.pressButton();
                                replay =false;
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    }
                    break;
                case '4':
                    System.out.println("Terminating Program!");
                    replayOutside = false;
                    return;
            }
        }
    }
}