/*
Pawri Meme :Lately, Geeku has been inspired by the "pawri" meme. Therefore, he decided to take a string S and change each of its substrings that spells "party" to "pawri".

Print the resulting string

Input Format

A string

Constraints

1≤∣S∣≤10

S contains only lowercase English letters

Output Format

A string

Sample Input 0

partypartiparty
Sample Output 0

pawripartipawri
Explanation 0

The original string has 2 substrings "party".
 */


package java.Module2.Contest4;

import java.io.*;
import java.util.*;

public class pawriMeme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        String replace = s.replaceAll("party","pawri");
        System.out.println(replace);
        
    }
}
