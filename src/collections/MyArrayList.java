package collections;

import java.util.ArrayList;

public class MyArrayList<T> extends MyCollection<T>{

    ArrayList<T> arrayList = new ArrayList<>();

    public void addElement(T element) {
        arrayList.add(element);
    }


    public void printElements() {
        for (T element : arrayList) {
            System.out.println(element);
        }
    }

}
