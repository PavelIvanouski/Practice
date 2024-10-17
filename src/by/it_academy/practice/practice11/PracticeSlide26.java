package by.it_academy.practice.practice11;

public class PracticeSlide26 {
    public static void main(String[] args) {
        String str = " It is a long established       , fact     that a reader      will be      distracted by the readable,   content  of a page when looking at its layout       . ";
        str = str.trim();
        str = str
                .replaceAll("(\\s+)", " ")
                .replaceAll("\\s+,", ",")
                .replaceAll("\\s+\\.", ".");
        System.out.println(str);
    }
}
