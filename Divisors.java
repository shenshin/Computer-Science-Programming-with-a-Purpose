/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     21/5/2020
 **************************************************************************** */

public class Divisors {
    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) return 0;
        int first = Math.abs(a);
        int second = Math.abs(b);
        while (second != 0) {
            int temp = first;
            first = second;
            second = temp % second;
        }
        return first;
    }

    // Returns the least common multiple of a and b.
    // Наименьшее общее кратное
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return (int) (Math.abs((long) a) * Math.abs((long) b) / (long) gcd(a, b));
    }

    // Returns true if a and b are relatively prime; false otherwise.
    // Взаимно (относительно) простые числа
    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    // общая функция (totient function)
    public static int totient(int n) {
        if (n <= 0) return 0;
        int counter = 0;
        for (int i = 1; i <= n; i++)
            if (areRelativelyPrime(i, n)) counter++;
        return counter;
    }

    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String twoIntsFormat = "%s(%d,%d) = %d%n";
        String oneIntFormat = "%s(%d) = %d%n";
        String boolFormat = "%s(%d,%d) = %b%n";
        StdOut.printf(twoIntsFormat, "gcd", a, b, gcd(a, b));
        StdOut.printf(twoIntsFormat, "lcm", a, b, lcm(a, b));
        StdOut.printf(boolFormat, "areRelativelyPrime", a, b, areRelativelyPrime(a, b));
        StdOut.printf(oneIntFormat, "totient", a, totient(a));
        StdOut.printf(oneIntFormat, "totient", b, totient(b));
    }
}
