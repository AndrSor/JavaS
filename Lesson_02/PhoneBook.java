package Lesson_02;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

    private Map<String,String> pBook = new HashMap<>();

    public PhoneBook(){};

    public void add(String phone,String family) {
        pBook.put(phone,family);
        //System.out.println(pBook);
    }

    public Set<String> get(String family) {
        Set<String> contByPhone = new TreeSet<>();
        for(String key:pBook.keySet()){
            if(family.equals(pBook.get(key))){
                contByPhone.add(key);
            }
        }
        return contByPhone;
    }
}
