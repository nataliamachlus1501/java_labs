package collections_pt2;
import java.util.ArrayList;
import java.util.Iterator;

public class Main_Iterator {
    public static void main(String[] args){
        ArrayList<String> arrL = new ArrayList<String>();
        arrL.add("Sweden");
        arrL.add("Japan");
        arrL.add("Kuba");
        arrL.add("Spain");

        for(Iterator<String> it = arrL.iterator(); it.hasNext();){
            it.next();
            it.remove();
        }

        ///Po usunieciu elementow lista zmienila swoj rozmiar dla i =2 i dla i = 3 = rozmiar listy
        //for(int i = 0; i < arrL.size(); i++){
            //System.out.println(arrL.remove(i));
            //System.out.println(arrL.size());
        //}

        System.out.println("ArrayList size: " + arrL.size());
        for(int i = 0;i < arrL.size(); i++){
            System.out.println(arrL.get(i));
        }
    }

}
