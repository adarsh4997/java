/*
Kavin likes to play table tennis. He found some statistics of matches which described who won the points in order. A game shall be won by the player first scoring 11 points except in the case when both players have 10 points each, then the game shall be won by the first player subsequently gaining a lead of 2 points. Could you please help the Kavin find out who the winner was from the given statistics? (It is guaranteed that statistics represent always a valid, finished match.

Input Format

a binary string S, which describes a match. '0' means Chef lose a point, whereas '1' means he won the point.

Constraints

1 ≤ T ≤ 1000
1 ≤ length(S) ≤ 100
Output Format

Output on a separate line a string describing who won the match. If Chef won then print "WIN" (without quotes), otherwise print "LOSE" (without quotes).

Sample Input 0

0101111111111
Sample Output 0

WIN
Explanation 0

Chef won the match 11:2, his opponent won just two points, the first and the third of the match.

Sample Input 1

11100000000000
Sample Output 1

LOSE
 */

package java.Module2.Contest4;

import java.util.*;

public class kavinandTT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String match = scanner.nextLine();
        int chefScore = 0;
        int opponentScore = 0;

        // Iterating through the match
        for (char c : match.toCharArray()) {
            if (c == '0') {
                opponentScore++;
            } else {
                chefScore++;
            }
            
            // Check if either player has reached 11 points
            if (chefScore >= 11 || opponentScore >= 11) {
                // Check if either player has a lead of at least 2 points
                if (Math.abs(chefScore - opponentScore) >= 2) {
                    // Determine the winner
                    System.out.println(chefScore > opponentScore ? "WIN" : "LOSE");
                    return;
                }
            }
        }
        
        // If the match ends without either player reaching 11 points,
        // the player with the highest score wins
        System.out.println(chefScore > opponentScore ? "WIN" : "LOSE");
    }
}

