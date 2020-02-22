public class FactorialRecursia {

        int fact(int n) {
            int result;

            if(n == 1) return 1;
            result = fact(n - 1) * n;

            return result;

        }
    }

    class Recursion {

        public static void main(String args[]) {

            FactorialRecursia fact = new FactorialRecursia();

            int n = 5;
            System.out.println(n + "! = " + fact.fact(n));

        }

    }

