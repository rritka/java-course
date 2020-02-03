public class CalculatorWithOperator {

    public double minus (double a, double b) {
        return a - b;
    }

    public double plus (double a, double b) {
        return a + b;
    }

    public double multiply (double a, double b) {
        return a * b;
    }

    public double divide (double a, double b) {
        return a / b;
    }

    public double power (double a, int b) {
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        } return result;
    }

    public double sqrt (double a) {
        double result = a / 2;       //первое приближение
        double epsilon = 0.01;     //погрешность расчета
        while ((result - a / result) > epsilon) {
            result = 0.5 * (result + a / result);
        }
        return result;
    }

    public double abs (double a) {
        double result = 1;
        if (a < 0)
            result = a * -1;
        return result;
    }

}
