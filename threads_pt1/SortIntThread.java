package threads_pt1;

import java.util.ArrayList;
import java.util.Collections;

///selects only integers from unsorted mixedArrL and then sort them in an ascending order.
public class SortIntThread extends Thread{
    ArrayList  initialArrL;

    SortIntThread(ArrayList initialArrL){
        this.initialArrL = initialArrL;
    }

    @Override
    public void run() {
        ArrayList <Integer> arrInt = new ArrayList<>();
        for(int j=0; j<initialArrL.size();j++){
            if (initialArrL.get(j).getClass().getSimpleName().equals("Integer")){
                arrInt.add((Integer)initialArrL.get(j));
            }
        }
        Collections.sort(arrInt);
        System.out.println("Sorted array of integers: " + arrInt);

        Sorting.arr1.addAll(arrInt);
    }
}
