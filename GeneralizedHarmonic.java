/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     5/5/2020
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        double n = Math.abs(Double.parseDouble(args[0]));
        if (n == 0) n = 1;
        double r = Double.parseDouble(args[1]);
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / Math.pow(i, r);
        }
        System.out.println(sum);
    }
}
