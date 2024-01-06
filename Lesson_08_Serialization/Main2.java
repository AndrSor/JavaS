package Lesson_08_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main2 {

    public static void main(String[] args) throws IOException {

        //создаем наш объект
        TerritoriesInfo territoriesInfo = new TerritoriesInfo("У Испании 6 провинций, у России 10 провинций, у Франции 8 провинций");
        ResourcesInfo resourcesInfo = new ResourcesInfo("У Испании 100 золота, у России 80 золота, у Франции 90 золота");
        DiplomacyInfo diplomacyInfo =  new DiplomacyInfo("Франция воюет с Россией, Испания заняла позицию нейтралитета");


        SavedGame2 savedGame = new SavedGame2(territoriesInfo, resourcesInfo, diplomacyInfo);

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Admin\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(savedGame);

        objectOutputStream.close();
    }


}
