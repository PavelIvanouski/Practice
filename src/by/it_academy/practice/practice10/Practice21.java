package by.it_academy.practice.practice10;

public class Practice21 {
    public static void main(String[] args) {
        String string = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        System.out.println(string);
        String[] words = string.split(" ");
        int longWordIndex = -1;
        int shortWordIndex = -1;
        String longWord = "";
        String shortWord = string;
        for (int i = 0; i < words.length; i++) {
            if (shortWord.length() >= words[i].length()) {
                shortWord = words[i];
                shortWordIndex = i;
            }
        }
        for (int i = words.length - 1; i > 0; i--) {
            if (longWord.length() <= words[i].length()) {
                longWord = words[i];
                longWordIndex = i;
            }
        }
        words[longWordIndex] = shortWord;
        words[shortWordIndex] = longWord;
        System.out.println("Short word: " + shortWord);
        System.out.println("Long word: " + longWord);
        System.out.println(String.join(" ", words));

    }
}
