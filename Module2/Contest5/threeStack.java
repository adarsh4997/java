/*
You have three stacks of cuboid where each cuboid has the same length and breadth, but they may vary in height. You can change the height of a stack by removing and discarding its topmost cuboid any number of times.

Find the maximum possible height of the stacks such that all of the stacks are exactly the same height. This means you must remove zero or more cuboid from the top of zero or more of the three stacks until they are all the same height, then return the height.

Input Format

The first line contains three space-separated integers, n1, n2, and n3, the numbers of cuboid in stacks 1, 2, and 3. The subsequent lines describe the respective heights of each cuboid in a stack from top to bottom:

Constraints

0<=n1,n2,n3<=10^5
0<=height of any satck<=100
Output Format

Print an integer denoting the equalized heights of the stacks.

Sample Input 0

4 3 2
1 2 1 1
1 1 2
1 1
Sample Output 0

2
Explanation 0

There are 4,3 and 2 cuboids in the three stacks, with their heights in the three arrays. Remove the top 2 cylinders from h1 (heights = [1, 2]) and from h2 (heights = [1, 1]) so that the three stacks all are 2 units tall. Return 2 as the answer.
 */

package java.Module2.Contest5;

import java.io.*;
import java.util.*;

public class threeStack {
    
    public static int equalHeight(Stack<Integer> st1, Stack<Integer> st2, Stack<Integer> st3){
        int h1 = heightSum(st1);
        int h2 = heightSum(st2);
        int h3 = heightSum(st3);

        while(!(h1 == h2 && h2 == h3) && !(st1.isEmpty() || st2.isEmpty() || st3.isEmpty())){
            if(h1 >= h2 && h1 >= h3){
                h1 -= st1.pop();
            }
            else if(h2 >= h1 && h2 >= h3){
                h2 -= st2.pop();
            }
            else{
                h3 -= st3.pop();
            }
        }
        return h1;
    }

    
    public static int heightSum(Stack<Integer> s){
        int sum = 0;
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            int num = s.pop();
            sum += num;
            temp.push(num);
        }

        // Restore the original stack by pushing elements back from the temporary stack
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    
        return sum;
    }

    
    public static Stack<Integer> reverse(Stack<Integer> s){
        //temporary stack to reverse the stack
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            int num = s.pop();
            temp.push(num);
        }
        return temp;
    }
    

    //Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        //stack 1
        Stack<Integer> st1 = new Stack<>();
        for(int i = 0; i < n1; i++){
            st1.push(sc.nextInt());
        }
        
        //stack 2
        Stack<Integer> st2 = new Stack<>();
        for(int i = 0; i < n2; i++){
            st2.push(sc.nextInt());
        }
        
        //stack 3
        Stack<Integer> st3 = new Stack<>();
        for(int i = 0; i < n3; i++){
            st3.push(sc.nextInt());
        }
        
        //reason for reverse:  because in question elements were poping from front instead of last
        // if you won't reverse you'll get 1 instead of two.
        Stack<Integer> s1 = reverse(st1);
        Stack<Integer> s2 = reverse(st2);
        Stack<Integer> s3 = reverse(st3);
        
        
        int maxHeight = equalHeight(s1,s2,s3);
        
        System.out.print(maxHeight);
        
    }
}
