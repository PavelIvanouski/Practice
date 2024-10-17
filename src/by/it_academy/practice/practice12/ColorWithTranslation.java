package by.it_academy.practice.practice12;

public enum ColorWithTranslation {
    RED("красный", 1),
    ORANGE("оранжевый", 2),
    YELLOW("желтый", 3),
    BLUE("голубой", 4);

    private final String translation;
    private final int colorNumber;

    public String getTranslation() {
        return translation;
    }

    ColorWithTranslation(String translation, int colorNumber) {
        this.translation = translation;
        this.colorNumber = colorNumber;
    }

    public static ColorWithTranslation valueOfBYTranslation(String translation) {
        for (ColorWithTranslation color : ColorWithTranslation.values()) {
            if (color.translation.equalsIgnoreCase(translation)) {
                return color;
            }
        }
        throw new IllegalArgumentException();
    }

    public static ColorWithTranslation valueOfBYColorNumber(int number) {
        for (ColorWithTranslation color : ColorWithTranslation.values()) {
            if (color.colorNumber == number) {
                return color;
            }
        }
        throw new IllegalArgumentException();
    }

}
