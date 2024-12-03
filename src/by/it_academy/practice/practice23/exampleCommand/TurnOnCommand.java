package by.it_academy.practice.practice23.exampleCommand;

public class TurnOnCommand implements Command {

   private Television television;

   public TurnOnCommand(Television television) {
       this.television = television;
   }

   @Override
   public void execute() {
       television.turnOn();
   }
}
