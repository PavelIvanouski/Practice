package by.it_academy.practice.practice7.staticExample;

public class StaticBlockDemo {
    public static String[] ranks = new String[5];

    static {
        ranks[0] = "Lieutenant";
        ranks[1] = "Captain";
        ranks[2] = "Major";
    }

    static {
        ranks[3] = "Colonel";
        ranks[4] = "General";
    }
}
