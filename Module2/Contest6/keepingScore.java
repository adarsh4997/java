/*
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.

Record a new score of x.

'+'.

Record a new score that is the sum of the previous two scores.

'D'.

Record a new score that is the double of the previous score.

'C'.

Invalidate the previous score, removing it from the record.

Input Format

first line of input contains integer N representing the size of array.

second line of input contains N strings representing the elements of array.

Constraints

1 <= operations.length <= 1000

operations[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].

For operation "+", there will always be at least two previous scores on the record.

For operations "C" and "D", there will always be at least one previous score on the record.

Output Format

Return the sum of all the scores on the record after applying all the operations.

Sample Input 0

5
5 2 C D +
Sample Output 0

30
 */

package java.Module2.Contest6;

import java.io.*;
import java.util.*;

public class keepingScore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] A = new String[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.next();
        }
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < n; i++){

            if(A[i].equals("+")){
                int top = st.peek();
                int secTop = st.pop() + st.peek();
                st.push(top);
                st.push(secTop);
            }
            else if(A[i].equals("D")){
                st.push(st.peek()*2);
            }
            else if(A[i].equals("C")){
                st.pop();
            }
            else {
                st.push(Integer.parseInt(A[i]));
            }
            
        }
        
        int sum = 0;
        for(int e : st){
            sum += e;
        }
        
        System.out.print(sum);
        
        
    }
}
