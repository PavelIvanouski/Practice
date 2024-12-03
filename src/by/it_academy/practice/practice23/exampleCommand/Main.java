package by.it_academy.practice.practice23.exampleCommand;

public class Main {
    public static void main(String[] args) {
        Television television = new Television();

        Command turnOnCommand = new TurnOnCommand(television);
        Command turnOffCommand = new TurnOffCommand(television);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, turnOnCommand);
        remoteControl.setCommand(1, turnOffCommand);

        remoteControl.pressButton(0);
        remoteControl.pressButton(1);
    }

}
