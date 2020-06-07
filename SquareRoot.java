/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     4/5/2020
 **************************************************************************** */

public class SquareRoot {
    public static void main(String[] args) {
        double EPS = 1.0E-15; // точность вычислений корня
        double c = Double.parseDouble(args[0]);
        double t = c;
        System.out.println(t);
        while (Math.abs(t - c / t) > t * EPS) {
            t = (c / t + t) / 2;
            System.out.println(t);
        }
        System.out.println(t * t);
    }
}
