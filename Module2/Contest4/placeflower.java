/*
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer k, return if k new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

Input Format

An integer N representing the length of array.
N integers representing the elements of array.
An interger K representing the no. of flowers.
Constraints

1 <= flowerbed.length <= 2 * 104

flowerbed[i] is 0 or 1.

There are no two adjacent flowers in flowerbed.

0 <= n <= flowerbed.length

Output Format

print true or false.

Sample Input 0

5
1 0 0 0 1
1
Sample Output 0

true
 */

package java.Module2.Contest4;

import java.io.*;
import java.util.*;

public class placeflower {
    
    public static boolean canPlace(int[] flowerbed, int n){
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                if((i==0 || flowerbed[i-1] == 0) && (i==flowerbed.length-1 || flowerbed[i+1] == 0)){
                    flowerbed[i] = 1;
                    count++;
                    if(count >= n)
                        break;
                }
            }
        }
        return count>=n?true:false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] flowerbed = new int[n];
        for(int i = 0; i < n; i++){
            flowerbed[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        
        boolean res = canPlace(flowerbed, k);
        
        System.out.println(res);
        
    }
}
