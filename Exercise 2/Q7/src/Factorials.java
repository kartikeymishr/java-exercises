public class Factorials {
    public long factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return factorial(n - 1) * n;
    }

    public void intFactorials() {
        int fact;
        int previous = 0;

        System.out.println(Integer.MAX_VALUE);

        for (int i = 1; i < 20; i++) {
            fact = (int) factorial(i);
            if ((fact < Integer.MAX_VALUE) && (fact > previous)) {
                System.out.println("The factorial of " + i + " is " + fact);
                previous = fact;
            } else {
                System.out.println("The factorial of " + i + " is out of range");
                return;
            }
        }
    }

    public void longFactorials() {
        long fact;
        long previous = 0;

        for (int i = 1; i < 40; i++) {
            fact = factorial(i);
            if ((fact < Long.MAX_VALUE) && (fact > previous)) {
                System.out.println("The factorial of " + i + " is " + fact);
                previous = fact;
            } else {
                System.out.println("The factorial of " + i + " is out of range");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Factorials f = new Factorials();

        f.intFactorials();
        System.out.println();
        f.longFactorials();
    }

}
