/* *****************************************************************************
 *  Name:              Alex Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     14/5/2020
 **************************************************************************** */
/*
Suppose that people enter a room one at a time. How people must enter until
 two share a birthday? Counterintuitively, after 23 people enter the room,
  there is approximately a 50–50 chance that two share a birthday.
   This phenomenon is known as the birthday problem or birthday paradox.
Write a program Birthday.java that takes two integer command-line
 arguments n and trials and performs the following experiment, trials times:
  */
public class Birthday {
    public static void main(String[] args) {
        int n = Math.abs(Integer.parseInt(args[0]));
        if (n == 0) n = 1;
        int trials = Math.abs(Integer.parseInt(args[1]));

        int[] count = new int[n + 1];

        for (int i = 0; i < trials; i++) {
            int peopleEntered = 0;
            boolean[] room = new boolean[n + 1];
            while (true) {
                // Choose a birthday for the next person, uniformly at
                // random between 0 and n−1.
                int birthday = (int) (Math.random() * (double) (n - 1));
                // If that person shares a birthday with someone
                // else in the room, stop;
                if (room[birthday]) break;
                // Have that person enter the room.
                room[birthday] = true;
                peopleEntered++;
            }
            // In each experiment, count the number of people that
            // enter the room.
            count[peopleEntered]++;
        }
        /*
        Print a table that summarizes the results (the count i, the number
         of times that exactly i people enter the room, and the fraction of
          times that i or fewer people enter the room) for each possible
           value of i from 1 until the fraction reaches (or exceeds) 50%.
            */

        double previous = 0;
        for (int i = 0; ; i++) {
            double fraction = previous + ((double) count[i] / (double) trials);
            System.out.format("%-10d%-10d%f%n", i + 1, count[i], fraction);
            if (fraction >= 0.5) break;
            previous = fraction;
        }
    }
}
