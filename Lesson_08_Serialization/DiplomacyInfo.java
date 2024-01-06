package Lesson_08_Serialization;

import java.io.Serializable;

public class DiplomacyInfo implements Serializable {

    private String info;

    public DiplomacyInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        this.info = info;
    }



}
