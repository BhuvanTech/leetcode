package factorial;

public class HomeClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,5);
//        f1.print();
//        f1.setNumerator(12);
////        System.out.println(f1.getNumerator());
//        f1.increament();
        f1.print();

        Fraction f2 = new Fraction(3,8);
        //adding and updating first fraction
        f2.print();
//        f1.add(f2);
//        f1.print();
        //adding to new fraction
        Fraction f3 = Fraction.addTwoF(f1, f2);
        f3.print();
    }

}
