/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
 

Constraints:

1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109
 */

package java.MCT2;
import java.util.*;

class leetcode875 {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(piles[i], max);
        }

        int start = 1;
        int end = max;
        int ans = Integer.MAX_VALUE;
        while(start <= end){    //1 2 3 4 5 6 7 8 9 10 11
            int mid = start + (end-start)/2;
            int th = totalHours(piles, mid);
            if(th <= h){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public int totalHours(int[] piles, int m){
        int total = 0;
        for(int i = 0; i < piles.length; i++){
            total += Math.ceil((double)piles[i] / (double) m);
        }
        return total;
    }
}
