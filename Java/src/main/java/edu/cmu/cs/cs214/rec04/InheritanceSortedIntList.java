package edu.cmu.cs.cs214.rec04;

public class InheritanceSortedIntList extends AbstractIntList {

    private int totalAdded;

    public InheritanceSortedIntList() {
        super();
        totalAdded = 0;
    }

    @Override
    public boolean add(int value) {
        totalAdded++;
        return super.add(value);
    }

    @Override
    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return super.addAll(list);
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}
