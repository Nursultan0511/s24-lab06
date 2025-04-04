package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class DelegationSortedIntListTest {

    private DelegationSortedIntList list1;
    private DelegationSortedIntList list2;
    private DelegationSortedIntList list3;
    /**
     * Тест бүрийн өмнө setUp() дуудагдана.
     */
    @Before
    public void setUp() {
        list1 = new DelegationSortedIntList();
        list2 = new DelegationSortedIntList();
        list3 = new DelegationSortedIntList();
    }

    /**
     * add() аргын ажиллагааг шалгана.
     */
    @Test
    public void testAdd() {
        // 5 элемент нэмнэ
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        // Нийт нэмэх оролдлого 5 байх ёстой.
        assertTrue(list1.getTotalAdded() == 5);

        // Жагсаалтыг хэвлэж шалгах
        printList(list1);
    }

    /**
     * addAll() аргын ажиллагааг шалгана.
     */
    @Test
    public void testAddAll() {
        // Эхний жагсаалтанд 5 элемент нэмнэ.
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        list3.add(4);
        list3.add(10);
        list3.add(41);
        assertTrue(list1.getTotalAdded() == 5);

        list2.add(3);
        list2.add(0);
        assertTrue(list2.getTotalAdded() == 2);
        list2.addAll(list1);
        assertTrue(list3.getTotalAdded()==3);
        assertTrue(list2.getTotalAdded() == 7);


        printList(list2);
        printList(list3);
    }

    /**
     * Жагсаалтыг хэвлэхэд туслах функц.
     * @param list Хэвлэх жагсаалт.
     */
    private void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
