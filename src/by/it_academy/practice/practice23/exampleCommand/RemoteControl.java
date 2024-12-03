package by.it_academy.practice.practice23.exampleCommand;

public class RemoteControl {

   private Command[] commands;

   public RemoteControl() {
       commands = new Command[5]; // У пульта 5 кнопок
   }

   public void setCommand(int slot, Command command) {
       commands[slot] = command;
   }

   public void pressButton(int slot) {
       if (commands[slot] != null) {
           commands[slot].execute();
       }
   }
}
