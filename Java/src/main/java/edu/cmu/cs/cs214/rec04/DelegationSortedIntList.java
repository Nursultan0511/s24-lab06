package edu.cmu.cs.cs214.rec04;

public class DelegationSortedIntList implements IntegerList {

    private final SortedIntList delegate;
    private int totalAdded;

    public DelegationSortedIntList() {
        this.delegate = new AbstractIntList();
        this.totalAdded = 0;
    }

    @Override
    public boolean add(int num) {
        totalAdded++;
        return delegate.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return delegate.addAll(list);
    }

    public int getTotalAdded() {
        return totalAdded;
    }

    @Override
    public int get(int index) {
        return delegate.get(index);
    }

    @Override
    public boolean remove(int num) {
        return delegate.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return delegate.removeAll(list);
    }

    @Override
    public int size() {
        return delegate.size();
    }

    @Override
    public String toString() {
        return delegate.toString();
    }
}
