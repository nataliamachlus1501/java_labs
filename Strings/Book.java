package Strings;

public class Book {
    public String author;
    public String title;
    public int noOfPages;

    Book(String a, String t, int n){
        author = a;
        title = t;
        noOfPages = n;
    }
    public int titleLength(){
        return title.length();
    }

    public static void main(String[] args){
        Book nr1 = new Book("Leo Tolstoy","War and Piece",1000);
        Book nr2 = new Book("René Goscinny","Le Petit Nicola",100);
        System.out.println(nr1.titleLength());
        System.out.println(nr2.titleLength());
    }
}
