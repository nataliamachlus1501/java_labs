package Classes;

public class Circlepv_main {
    public static void main(String[] args){
        Circle_pv c = new Circle_pv( 4);
        double p = c.circumference();
        System.out.println(p);
        System.out.println("Circumference:" + p);
        c.setRadius(8);
        System.out.println(c.getRadius());
    }
}
