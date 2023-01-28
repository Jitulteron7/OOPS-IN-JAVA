package FractionPackage;

 public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            // TODO error out
            return;
        }
        this.denominator = denominator;
        simplify();
    }


    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int n) {
        this.numerator = n;
        simplify();
    }


    public void setDenominator(int d) {
        if (d == 0){
            // TODO error out
            return;
        }
        this.denominator = d;
        this.simplify();
    }

    public void print() {
        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }


    }

    private void simplify() {
        // private function to convert the fraction into its standard form
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        // add f1 and f2, keep it in third fraction object, return the third fraction object
        int denominator = f1.denominator * f2.denominator;
        int numerator = f1.numerator*f2.denominator + f2.numerator*f2.denominator;
        Fraction f3 = new Fraction(numerator,denominator);
//        this.simplify(); why ??

        return f3;

    }

    public void add(Fraction f2) {
        // add this and f2, keep result in this
        this.numerator =this.numerator*f2.denominator + f2.numerator*this.denominator;
        this.denominator += f2.denominator*this.denominator;

    }

    public void multiply(Fraction f2) {
        // multiply this and f2, keep result in this
        this.numerator*=f2.numerator;
        this.denominator*=f2.denominator;
    }

}