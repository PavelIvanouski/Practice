package by.it_academy.practice.practice8;

public class Bus extends Automobile{

    private int passengersCapacity;

    public Bus(String colour, String name, int passengersCapacity) {
        super(colour, name);
        this.passengersCapacity = passengersCapacity;
        System.out.println("Bus constructor!");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "colour='" + super.getColour() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", passengersCapacity=" + passengersCapacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("This is bus!");
    }


    public void overloadTest(String str) {
        System.out.println("Child " + str);
    }

    public int getPassengersCapacity() {
       return passengersCapacity;
   }

   public void setPassengersCapacity(int passengersCapacity) {
       this.passengersCapacity = passengersCapacity;
   }
}
