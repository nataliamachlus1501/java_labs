package threads_pt1;

import java.util.ArrayList;
import java.util.Collections;

///selects only char values and then sort them alphabetically.
public class SortStrThread extends Thread{
    ArrayList  initialArrL;

    SortStrThread(ArrayList initialArrL){
        this.initialArrL = initialArrL;
    }


    @Override
    public void run() {
        ArrayList<String> arrStr = new ArrayList<>();
        for(int j=0; j<initialArrL.size();j++){
            if (initialArrL.get(j).getClass().getSimpleName().equals("String")){
                arrStr.add((String)initialArrL.get(j));
            }
        }
        Collections.sort(arrStr);
        System.out.println("Sorted array of strings: " +arrStr);

        Sorting.arr1.addAll(arrStr);
    }
}
