package Classes;

public class Rectangle  {
    public int length;
    public int width;

    Rectangle(int l, int w){
        length = l;
        width = w;
    }
    public int perimeter(){
        return 2*(width + length);
    }
    public int area(){
        return width*length;
    }
}
