/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     21/5/2020
 **************************************************************************** */

public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x < 0) return 0;
        else if (x == 0) return 0.5;
        else return 1;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        return 1 / (1 + Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x == Double.POSITIVE_INFINITY || x == Double.MAX_VALUE) return 1.0;
        if (x == Double.NEGATIVE_INFINITY || x == -Double.MAX_VALUE) return -1.0;
        return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x == Double.POSITIVE_INFINITY) return 1.0;
        if (x == Double.NEGATIVE_INFINITY) return -1.0;
        return x / (1 + Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x <= -2) return -1;
        else if (x > -2 && x < 0) return x + x * x / 4;
        else if (x >= 0 && x < 2) return x - x * x / 4;
        else return 1;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double argument = Double.parseDouble(args[0]);
        String f = "%9s(%.1f) = ";
        StdOut.printf(f, "heaviside", argument);
        StdOut.println(heaviside(argument));
        StdOut.printf(f, "sigmoid", argument);
        StdOut.println(sigmoid(argument));
        StdOut.printf(f, "tanh", argument);
        StdOut.println(tanh(argument));
        StdOut.printf(f, "softsign", argument);
        StdOut.println(softsign(argument));
        StdOut.printf(f, "sqnl", argument);
        StdOut.println(sqnl(argument));
    }
}
