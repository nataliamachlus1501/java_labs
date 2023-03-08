package collections_pt1;
import java.util.ArrayList;
public class Lodówka {
    static ArrayList<Jedzenie> jedzenie = new ArrayList<>();

    public static void dodaj(String nazwa, int ilosc){
        Jedzenie added = new Jedzenie(nazwa,ilosc);
        jedzenie.add(added);
    }
    public static void weź(String nazwa,int ilosc){
        String mess = "Trere is no such food";
        for(int i = 0; i < jedzenie.size();i++){
            if(jedzenie.get(i).getNazwa().equals(nazwa)){
                jedzenie.get(i).setIlosc(jedzenie.get(i).getIlosc() - ilosc);
                if(jedzenie.get(i).getIlosc() - ilosc <= 0){
                    jedzenie.remove(i);
                }
            }
        }
        System.out.println(mess);
    }
    public static void wyświetl(){
       for(int i = 0; i < jedzenie.size();i++){
           System.out.println(jedzenie.get(i).getNazwa());
           System.out.println(jedzenie.get(i).getIlosc());
       }
    }
}
