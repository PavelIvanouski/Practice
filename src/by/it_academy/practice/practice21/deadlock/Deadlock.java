package by.it_academy.practice.practice21.deadlock;

public class Deadlock {
    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s" + "  has bowed to me!%n", this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                            + " has bowed back to me!%n",
                    this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Deadlock.Friend alphonse =
                new Deadlock.Friend("Alphonse");
        final Deadlock.Friend gaston =
                new Deadlock.Friend("Gaston");
        Thread thread1 = new Thread(() -> alphonse.bow(gaston));
        thread1.start();

        Thread thread2 = new Thread(() -> gaston.bow(alphonse));
        thread2.start();
    }

}
