/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     5/5/2020
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int width = Math.abs(Integer.parseInt(args[0]));
        int n = Math.abs(Integer.parseInt(args[1]));
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if ((j >= i - n) && (j <= i + n)) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print("0  ");
                }
            }
            System.out.print("\n");
        }
    }
}
