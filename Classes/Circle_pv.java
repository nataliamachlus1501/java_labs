package Classes;

public class Circle_pv {
    private int radius;

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    Circle_pv(int r){
        radius = r;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }
}
