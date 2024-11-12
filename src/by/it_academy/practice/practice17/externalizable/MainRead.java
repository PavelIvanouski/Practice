package by.it_academy.practice.practice17.externalizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("resources/savedGameExternalizable.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


        UserInfo userInfo = (UserInfo) objectInputStream.readObject();
        System.out.println(userInfo);

        objectInputStream.close();

    }

}
