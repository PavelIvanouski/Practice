package by.it_academy.practice.practice23.exampleProxy;

public class IvoryTower implements WizardTower {
   public void enter(Wizard wizard) {
     System.out.printf("%s enters the tower.%n", wizard);
   }
}
