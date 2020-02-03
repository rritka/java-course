public class MainWithMath {

    public static void main(String[] args) {

        CalculatorWithMath calc2 = new CalculatorWithMath();

        double q = calc2.divide(28, 5);
        double w = calc2.power(q, 2);
        double e = calc2.multiply(15, 7);
        double r = calc2.plus(w, e);
        double result2 = calc2.plus(r, 4.1);

        System.out.println("result2 = " + result2);
        System.out.println(calc2.divide(result2, 0));
        System.out.println(calc2.divide(result2, 0.0d));

    }
}
