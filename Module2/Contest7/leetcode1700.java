// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/

package java.Module2.Contest7;
import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        Queue<Integer> qu = new LinkedList<>();
        for(int i = 0; i < students.length; i++){
            qu.add(students[i]);
        }

        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){ 
            st.push(sandwiches[i]);
        }

        int unableToEat = 0;
        while(!qu.isEmpty() && !st.isEmpty()){ 
            if(qu.peek() == st.peek()){
                qu.remove();
                st.pop();
                unableToEat = 0; // Reset unableToEat if a student eats
            }
            else{
                unableToEat++;
                if(unableToEat == qu.size()){
                    break; // Break out of the loop if all remaining students are unable to eat
                }
                int num = qu.remove();  
                qu.add(num);
            } 
        }
        return qu.size();
    }
}

