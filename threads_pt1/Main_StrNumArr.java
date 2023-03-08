package threads_pt1;

import java.util.ArrayList;

public class Main_StrNumArr{
    public static void main(String args[]) throws InterruptedException {
        ArrayList<Object> initialArrL = new ArrayList<Object>();
        initialArrL.add("c");
        initialArrL.add("d");
        initialArrL.add("a");
        initialArrL.add("e");
        initialArrL.add("b");
        initialArrL.add("g");
        initialArrL.add("f");
        initialArrL.add("i");
        initialArrL.add("h");
        initialArrL.add("j");
        initialArrL.add(1);
        initialArrL.add(9);
        initialArrL.add(8);
        initialArrL.add(5);
        initialArrL.add(2);
        initialArrL.add(4);
        initialArrL.add(3);
        initialArrL.add(7);
        initialArrL.add(6);
        initialArrL.add(10);

        System.out.println("Before Sorting: " + initialArrL);
        SortStrThread s2 = new SortStrThread(initialArrL);
        s2.start();
        s2.join();
        SortIntThread s1 = new SortIntThread(initialArrL);
        s1.start();
        s1.join();
        s2.join();
        System.out.println(Sorting.arr1);

    }
}







