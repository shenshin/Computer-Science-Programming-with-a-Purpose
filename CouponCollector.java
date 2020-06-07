/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class CouponCollector {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int cards = 0;


        for (int i = 0; i < trials; i++) {
            int distinct = 0;
            boolean[] found = new boolean[m];
            while (distinct < m) {
                int r = (int) (Math.random() * m);
                cards++;
                if (!found[r]) {
                    distinct++;
                    found[r] = true;
                }
            }
        }
        System.out.println(cards / trials);
        double x = (double) cards / (double) trials;
        double laplas = (double) m * Math.log(m) + 0.57721 * (double) m;
        System.out.println(Math.abs(laplas - x));
    }
}
