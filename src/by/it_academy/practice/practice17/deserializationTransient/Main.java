package by.it_academy.practice.practice17.deserializationTransient;


import by.it_academy.practice.practice17.serializationTransient.SavedGame;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("resources/savedGameTransient.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SavedGame savedGame = (SavedGame) objectInputStream.readObject();

        System.out.println(savedGame);

        objectInputStream.close();


    }

}
