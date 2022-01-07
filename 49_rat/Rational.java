/*
Team BPK: Ben Belotser, Perry Huang, Kosta Dubovskiy
APCS pd07
HW49 -- Rational Standards Compliance/Compliance/Making Rational.java comply with Comparable and adding .equals method
2021-12-22
time spent: 0.5 hour
DISCO

QCC
How do you extend make the class extend Comparable and make compareTo take an object instead of a Rational?
How do you make .equals take an object instead of a Rational?
*/

import javax.swing.JSpinner.NumberEditor;

public class Rational {
    protected int numerator;
    protected int denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int n, int d) {
        if (d != 0) {
        numerator = n;
        denominator = d;
        }
        else {
        numerator = 0;
        denominator = 1;
        }
    }

    public String toString() {
        return (numerator + "/" + denominator);
    }

    public double floatVal() {
        return (double)numerator / (double)denominator;
    }

    public void multiplyBy(Rational Rat) {
        numerator = numerator * Rat.numerator;
        denominator = denominator * Rat.denominator;
    }

    public void divideBy(Rational Rat) {
        numerator = numerator * Rat.denominator;
        denominator = denominator * Rat.numerator;
    }

    public static int gcd( int a, int b) {
      if (a == b) {
        return a;
      }
      else if (a > b) {
        return gcd(a-b, b);
      }
      else {
        return gcd(a, b-a);
      }
    }

    public void reduce() {
      int numDenomGCD = gcd(numerator, denominator);
      this.numerator /= numDenomGCD;
      this.denominator /= numDenomGCD;

    }

    public void addToSelf(Rational Rat) {
      // a / b + c / d = (ad + cb)/ bd
      this.numerator *= Rat.denominator; // this numerator goes from a -> ad
      this.numerator += Rat.numerator * this.denominator; // this numerator goes from ad -> ad + cb
      this.denominator *= Rat.denominator; // this denominator goes from b -> bd
    }

    public void subtractFromSelf(Rational Rat) {
      // a / b - c / d = (ad - cb)/ bd
      this.numerator *= Rat.denominator; // this numerator goes from a -> ad
      this.numerator -= Rat.numerator * this.denominator; // this numerator goes from ad -> ad - cb
      this.denominator *= Rat.denominator; // this denominator goes from b -> bd
    }

    public int compareTo(Rational Rat) {
      double callingObjVal = this.floatVal(); // easier to work w/ raw decimal value for comparisons than numerator / denominator
      double paramObjVal = Rat.floatVal(); // same reasoning as before
      if (this instanceof Rational && Rat instanceof Rational) {
        if (callingObjVal > paramObjVal) {
          return 1; // ours is larger than theirs
        } else if (callingObjVal < paramObjVal) {
          return -1; // ours is smaller than theirs
        }
        return 0; // equal
      }
      return -2; 
    }

    public 

    public static void main(String[] args) {
        Rational r = new Rational(3, 6);
        Rational s = new Rational(1, 2);
        r.reduce();
        System.out.println(r.toString());
        r.multiplyBy(s);
        System.out.println(r.toString());
        System.out.println(s.toString());
        r.divideBy(s);
        System.out.println(r.toString());
        System.out.println(s.toString());
        System.out.println(r.floatVal());
        System.out.println(s.floatVal());
        r.addToSelf(s);
        System.out.println(r.toString());
        System.out.println(s.toString());

    }
}
