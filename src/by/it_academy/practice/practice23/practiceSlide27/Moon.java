package by.it_academy.practice.practice23.practiceSlide27;

public class Moon implements CosmicBody{

    private final static int MASS=7345;
    private static Moon instance;

    @Override
    public int getVolume() {
        return MASS;
    }

    @Override
    public boolean isWater() {
        return Boolean.FALSE;
    }

    private Moon() {
    }

    public static Moon getInstance() {

        if (instance == null) {

            instance = new Moon();

        }

        return instance;

    }
}