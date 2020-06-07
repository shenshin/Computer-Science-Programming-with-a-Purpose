/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     5/5/2020
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Math.abs(Integer.parseInt(args[0]));
        int x = 0;
        int y = 0;
        int steps = -1;
        while (Math.abs(x) + Math.abs(y) <= r) {
            System.out.println("(" + x + ", " + y + ")");
            double rand = Math.random();
            if (rand < 0.25)
                x++;
            else if (rand >= 0.25 && rand < 0.5)
                x--;
            else if (rand >= 0.5 && rand < 0.75)
                y++;
            else
                y--;
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}
