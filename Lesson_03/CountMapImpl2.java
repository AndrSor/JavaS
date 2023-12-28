package Lesson_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CountMapImpl2<T> implements CountMap2<T> {

    private ArrayList<T> map = new ArrayList<>();

    @Override
    // добавляет элемент в этот контейнер
    public void add(T o) {
        map.add(o);
    }

    @Override
    //Возвращает количество добавлений данного элемента
    public int getCount(T o) {
        int count = 0;
        for(T item:map) {
            if(item == o) count ++;
        }
        return count;
    }

    @Override
    //Удаляет элемент из контейнера и возвращает количество его добавлений(до удаления)
    public int remove(T o) {
        Integer count = 0;

        //map.remove()
        //map.get(o);
        //map.remove(o);
        return count;
    }

    @Override
    //Количество разных элементов
    public int size() {
        return map.size();
    }


}
