/*
You are given a list of Integers. Return a modified list which is same as the previous list but if any element of the previous list is greater than 100 then, replace that element with 2 100s.

Input Format

The first line contains a integer N denoting the size of the list.

The second line contains N integers denoting the individual elements of the list.

Constraints

1 <= N <= 100000

Output Format

Output the new List.

Sample Input 0

5
105 20 21 44 104
Sample Output 0

100 100 20 21 44 100 100
Explanation 0

The first and last element of the list was greater than 100. So, it was replaced with "100 100"
 */

package java.Module2.Contest5;

import java.io.*;
import java.util.*;

public class DSAProblem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> lt = new ArrayList<>();
        List<Integer> nlist = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            lt.add(num);
            if(num > 100){
                nlist.add(100);
                nlist.add(100);
            }
            else{
                nlist.add(num);
            }
        }
        
        for(int e : nlist){
            System.out.print(e+" ");
        }
        
    }
}
