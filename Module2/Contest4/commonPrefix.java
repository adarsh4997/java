/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Input Format

a number N representing length of array

N number of string inputs as element of array.

Constraints

1 <= strs.length <= 200 0 <= strs[i].length <= 200 strs[i] consists of only lowercase English letters.

Output Format

print the longest common prefix.

Sample Input 0

3
flower flow flight
Sample Output 0

fl
 */

package java.Module2.Contest4;

import java.io.*;
import java.util.*;

public class commonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int n = strs.length;
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[n-1];
        int index = 0;
        while(index < s1.length() && index < s2.length()){
            if(s1.charAt(index)== s2.charAt(index)){
                index++;
            }
            else{
                break;
            }

        }
        return index == 0?"" : s1.substring(0,index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        
        //logic
        String longestCommonPrefix = longestCommonPrefix(s);
        
        System.out.println(longestCommonPrefix);
        
    }
}
