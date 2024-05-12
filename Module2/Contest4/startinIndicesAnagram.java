/*
Given two strings s and p, return an array of all the start indices of p's anagrams in s.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Input Format

You need to take two strings as input s and p.

Constraints

1 <= s.length(),p.length() <= 10^3

Output Format

Print all the starting index of anagram in given string s by giving a space between them.

Sample Input 0

cbaebabacd
abc
Sample Output 0

0 6
Explanation 0

Input: s = "cbaebabacd", p = "abc" Output:0 6 Explanation: The substring with start index = 0 is "cba", which is an anagram of "abc". The substring with start index = 6 is "bac", which is an anagram of "abc".
 */

package java.Module2.Contest4;

import java.io.*;
import java.util.*;

public class startinIndicesAnagram {
    
    static boolean isAnagram(int frqP[] , String str){
        int frqS[] = new int[26];
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            int t = ch-'a';
            frqS[t] = frqS[t]+1;
        }
        
        for(int i=0; i<frqP.length; i++){
            if(frqP[i] != frqS[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        int frqP[] = new int[26];
        for(int i=0; i < p.length(); i++){
            char ch = p.charAt(i);
            int t = ch-'a';
            frqP[t] = frqP[t]+1;
        }
        for(int i=0; i<s.length()-p.length()+1; i++){
            String sb = s.substring(i, i+p.length() );
            if(isAnagram(frqP, sb)){
                System.out.print(i+" ");
            }
        }       
    }
}
