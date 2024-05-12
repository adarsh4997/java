/*
Given a sequence of N strings , the task is to check if any two similar words come together then they destroy each other than print the number of words left in the sequence after this pairwise destruction.

Input Format

Single Integer N.
Sequence of N strings.
Constraints

1 <= N <= 1000
1 <= str.length() <= 10
Output Format

Print Number of words left in the sequence.
Sample Input 0

4
aa ab ab ac
Sample Output 0

2
Explanation 0

Here [aa, {ab,ab},ac] => [aa,ac]
Sample Input 1

4
aa ab ab aa
Sample Output 1

0
Explanation 1

Here [aa,{ab,ab},aa] => {aa,aa} => []
 */

package java.Module2.Contest5;

import java.io.*;
import java.util.*;

public class deleteConsecutives {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String> st = new Stack<>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            if(!st.isEmpty() && st.peek().equals(s)){
                st.pop();
            }
            else{
                st.push(s);
            }  
        }
        
        System.out.print(st.size());
        
        
    }
}
