package Classes;

public class Circle {
    public int radius;

    Circle(int r){
        radius = r;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }
}

