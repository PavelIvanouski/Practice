package by.it_academy.practice.practice23.exampleCommand;

public class TurnOffCommand implements Command {

   private Television television;

   public TurnOffCommand(Television television) {
       this.television = television;
   }

   @Override
   public void execute() {
       television.turnOff();
   }
}
