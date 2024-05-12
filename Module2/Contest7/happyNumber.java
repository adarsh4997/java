/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy. Return true if n is a happy number, and false if not.

Input Format

First line contains an integer n.

Constraints

1 <= n <= 2^31 - 1

Output Format

Returns a boolean value.

Sample Input 0

19
Sample Output 0

true
 */

package java.Module2.Contest7;

import java.io.*;
import java.util.*;

public class happyNumber {
    
    public static boolean isHappy(int n){
        HashSet<Integer> hs = new HashSet<>();
        while(true){
            int sum = 0;
            while(n != 0){
                int t = n % 10;
                sum += (t*t);
                n /= 10;
            }
            n = sum;
            
            if(sum == 1)    return true;
            if(hs.contains(sum)){
                return false;
            }
            else{
                hs.add(sum);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isHappy(n));
    }
}
