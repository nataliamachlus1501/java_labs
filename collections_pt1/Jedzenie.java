package collections_pt1;

public class Jedzenie {
    private String nazwa;
    private int ilosc;

    public String getNazwa() {
        return nazwa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

///constructor
    Jedzenie(String nazwa, int ilosc){
        this.nazwa = nazwa;
        this.ilosc = ilosc;
    }
}
