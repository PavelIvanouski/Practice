package by.it_academy.practice.practice10;

public class Example16 {
    public static void main(String[] args) {
        String str = "Я стану отличным программистом";
        int len = str.length();
        System.out.println("Длина строки " + len + " символов.");

        String[] strs = str.split(" ");
        System.out.println("В тексте " + strs.length + " слов.");

        String newStr = str + ", если буду хорошо учиться.";
        System.out.println("Длина строки " + newStr.length() + " символов.");

        String result = newStr.replace("программистом", "Java-программистом");
        System.out.println(result);
    }
}
