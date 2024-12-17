package by.it_academy.practice.practice27.compareExample;

public class Example {
    public static void main(String[] args) {
        int a  = 11;
        String aBinary = Integer.toBinaryString(a);
        System.out.println(aBinary);
        int b  = 15;
        String bBinary = Integer.toBinaryString(b);
        System.out.println(bBinary);
        System.out.println(a & b);
    }
}
