public class Factorials {
    public long factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return factorial(n - 1) * n;
    }

    public int intFactorials() {
        int fact = 1;
        int previous = 0;

        for (int i = 1; i < 20; i++) {
            fact = (int) factorial(i);
            if ((fact < Integer.MAX_VALUE) && (fact > 0) && (fact > previous)) {
                System.out.println("The factorial of " + i + " is " + fact);
                previous = fact;
            } else {
                System.out.println("The factorial of " + i + " is out of range");
                return (int) factorial(i - 1);
            }
        }
        return 1;
    }

    public long longFactorials() {
        long fact = 1;
        long previous = 0;

        for (int i = 1; i < 40; i++) {
            fact = factorial(i);
            if ((fact < Long.MAX_VALUE) && (fact > 0) && (fact > previous)) {
                System.out.println("The factorial of " + i + " is " + fact);
                previous = fact;
            } else {
                System.out.println("The factorial of " + i + " is out of range");
                return factorial(i - 1);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Factorials f = new Factorials();

        f.intFactorials();
        System.out.println();
        f.longFactorials();
    }

}
