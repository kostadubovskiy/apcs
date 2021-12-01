import javax.swing.JSpinner.NumberEditor;

public class Rational {
    protected int numerator;
    protected int denominator;
    
    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public String toString() {
        return (numerator + "/" + denominator);
    }

    public float floatVal() {
        return (float)numerator / (float)denominator;
    }

    public void multiplyBy(Rational Rat) {
        numerator = numerator * Rat.numerator;
        denominator = denominator * Rat.denominator;
    }

    public void divideBy(Rational Rat) {
        numerator = numerator * Rat.denominator;
        denominator = denominator * Rat.numerator;
    }

    public static void main(String[] args) {

    }
}