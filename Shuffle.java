/* *****************************************************************************
 *  Name:              Aleksandr Shenshin
 *  Coursera User ID:  ******
 *  Last modified:     9/5/2020
 **************************************************************************** */

import java.util.Arrays;

// Алгоритм создания перемешанной колоды карт
public class Shuffle {
    public static void main(String[] args) {
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] suit = { "♣", "♦", "♥", "♠" };
        String[] deck = new String[52];
        for (int j = 0; j < suit.length; j++)
            for (int i = 0; i < rank.length; i++)
                deck[i + 13 * j] = rank[i] + suit[j];
        // Тасую карты
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int) (Math.random() * (deck.length - i));
            String t = deck[i];
            deck[i] = deck[r];
            deck[r] = t;
        }
        System.out.println(Arrays.toString(deck));
    }
}
