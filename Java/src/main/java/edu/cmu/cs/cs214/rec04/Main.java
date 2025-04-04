package edu.cmu.cs.cs214.rec04;

public class Main {

    public static void main(String[] args) {
        IntegerList list1;
        SortedIntList list2;

        list1 = new DelegationSortedIntList();
        list2 = new InheritanceSortedIntList();

        // add 5 elements to our first list.
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        System.out.println("DelegationSortedIntList:");
        printList(list1);
        System.out.println("Total added (Delegation): " + ((DelegationSortedIntList) list1).getTotalAdded());

        // add 2 elements to a second list.
        list2.add(3);
        list2.add(0);

        // add the first list (5 elements) to our second list (2 elements).
        list2.addAll(list1);

        System.out.println("InheritanceSortedIntList:");
        printList(list2);
        System.out.println("Total added (Inheritance): " + ((InheritanceSortedIntList) list2).getTotalAdded());
    }

    /**
     * A helper function that prints out the contents of an IntegerList.
     * @param list IntegerList to be printed out.
     */
    private static void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
