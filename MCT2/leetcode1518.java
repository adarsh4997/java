/*
There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle. The operation of drinking a full water bottle turns it into an empty bottle. Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

Input Format

An integer numBottles. An integer numExchange.

Constraints

1 <= numBottles <= 100
1 <= numExchange <= 10
Output Format

return the maximum number of water bottles you can drink.

Sample Input 0

9 3
Sample Output 0

13
Explanation 0

You can exchange 3 empty bottles to get 1 full water bottle. Number of water bottles you can drink: 9 + 3 + 1 = 13.
 */

package java.MCT2;

import java.util.*;

public class leetcode1518 {
    
    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;
            
            ans += newBottles;
            numBottles = newBottles+remBottles;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();
        System.out.print(numWaterBottles(numBottles, numExchange));
    }
}
