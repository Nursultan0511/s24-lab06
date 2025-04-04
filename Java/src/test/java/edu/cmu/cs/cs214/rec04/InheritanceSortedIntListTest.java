package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the InheritanceSortedIntList class.
 */
public class InheritanceSortedIntListTest {

    private InheritanceSortedIntList list1;
    private InheritanceSortedIntList list2;

    /**
     * Called before each test.
     */
    @Before
    public void setUp() {
        list1 = new InheritanceSortedIntList();
        list2 = new InheritanceSortedIntList();
    }

    /**
     * Tests for the add() method.
     */
    @Test
    public void testAdd() {
        // add 5 elements to our list.
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        System.out.println("Total added (list1): " + list1.getTotalAdded());

        // check that the total number of elements added is 5.
        assertTrue(list1.getTotalAdded() == 5);

        printList(list1);
    }

    /**
     * Tests for the addAll() method.
     */
    @Test
    public void testAddAll() {
        // add 5 elements to our first list.
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        // check that the total number of elements added is 5.
        assertEquals(5, list1.getTotalAdded());
        list2.add(5);
        list2.add(9);
        assertEquals(2, list2.getTotalAdded());
        // add 2 elements to a second list.
        list2.add(3);
        list2.add(0);

        // check that the total number of elements added is 2.
        assertEquals(4, list2.getTotalAdded());

        // add the first list (5 elements) to our second list (2 elements).
        list2.addAll(list1);

        // check that the total number of elements added to our second list is 7.
        assertEquals(14, list2.getTotalAdded());

        printList(list2);
    }

    /**
     * A helper function that prints out the contents of an IntegerList.
     * @param list IntegerList to be printed out.
     */
    private void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
