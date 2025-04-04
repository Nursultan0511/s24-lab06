package edu.cmu.cs.cs214.rec04;

import java.util.ArrayList;
import java.util.List;

public class AbstractIntList extends SortedIntList{

    private List<Integer> elements;

    public AbstractIntList() {
        elements = new ArrayList<>();
    }

    @Override
    public boolean add(int num) {
        elements.add(num);
        return true;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Indexiin hyazgaar hetersen bn.");
        }
        return elements.get(index);
    }

    @Override
    public boolean remove(int num) {
        return elements.remove((Integer) num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        boolean changed = false;
        for (int i = 0; i < list.size(); i++) {
            while (elements.remove((Integer) list.get(i))) {
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    public static void main(String[] args) {
        AbstractIntList list = new AbstractIntList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Anhni jagsaalt: " + list);

        AbstractIntList removeList = new AbstractIntList();
        removeList.add(20);
        removeList.add(40);

        list.removeAll(removeList);
        System.out.println("Ustgasinii daraah jagsaalt: " + list);
    }
}
