package factorial;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator){
        if(denominator == 0) {
//            throw error
            this.denominator=1;
        }
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int min = Math.min(numerator, denominator);
        for(int i=2; i<=min; i++){
            if(numerator%i == 0 && denominator%i == 0)
                gcd=1;
        }
        numerator/=gcd;
        denominator/=gcd;
    }

    public void print(){
        System.out.println(numerator+"/"+denominator);
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator){
        if(denominator == 0) {
//            throw error
            this.denominator=1;
        }
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }
    public void increament(){
        numerator+=denominator;
        simplify();
    }

    public void add(Fraction obj){
        numerator = numerator*obj.denominator + obj.numerator*denominator;
        denominator = denominator * obj.denominator;
        simplify();
    }

    public static Fraction addTwoF(Fraction obj1, Fraction obj2){
        int newNum =  obj1.numerator*obj2.denominator + obj2.numerator* obj1.denominator;
        int newDen = obj1.denominator * obj2.denominator;
        Fraction f3 = new Fraction(newNum, newDen);
        return f3;
    }
}
