package Lesson_08_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static <ListArray> void main(String[] args) throws IOException,ClassNotFoundException {

//        String[] territoryInfo = {"У Испании 6 провинций", "У России 10 провинций", "У Франции 8 провинций"};
//        String[] resourcesInfo = {"У Испании 100 золота", "У России 80 золота", "У Франции 90 золота"};
//        String[] diplomacyInfo = {"Франция воюет с Россией, Испания заняла позицию нейтралитета"};
//
//        SavedGame savedGame = new SavedGame(territoryInfo,resourcesInfo,diplomacyInfo);
//
//
//        FileOutputStream outputStream = new FileOutputStream("C:\\Admin\\save.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//        objectOutputStream.writeObject(savedGame);
//        objectOutputStream.close();



        FileInputStream fileInputStream = new FileInputStream("C:\\Admin\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        SavedGame savedGame = (SavedGame) objectInputStream.readObject();

        //System.out.println(savedGame);

        System.out.println("*****************");

        String[] st1 = savedGame.getTerritoriesInfo();

        System.out.println(String.join(",",st1));

        //System.out.println(String.join(",","1","2","3"));

    }

}
