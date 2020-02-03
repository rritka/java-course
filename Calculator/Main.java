public  class Main {

    public static void main(String[] args) {

        CalculatorWithOperator calc1 = new CalculatorWithOperator();

        double q = calc1.divide(28, 5);
        double w = calc1.power(q, 2);
        double e = calc1.multiply(15, 7);
        double r = calc1.plus(w, e);
        double result1 = calc1.plus(r, 4.1);

        System.out.println(result1);
        System.out.println(calc1.divide(result1, 0));
        System.out.println(calc1.divide(result1, 0.0d));



    }
}
