package lab_inheritance;

public class ScientificCalculator extends StandardCalculator{

    public double modulo(double a, double b){
        return a%b;
    }

    public double factorial(int a){
        if (a <= 2) {
            return a;
        }
        return a * factorial(a - 1);
    }

}
