/*
Once upon a time, there was a mathematician named Max who loved solving number puzzles. One day, he was given an array of integers and was challenged to find the maximum product of three numbers from the array.

Max eagerly accepted the challenge and began working on it. Help Max to find the maximum product of three numbers.

NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

Input Format

An integer N, which is the size of the array.

N integers, depicting the elements of the array.

Constraints

- 3<=N<=1000

- -1000<=arr[i]<=1000
Output Format

Return the maximum product of three numbers from the array.

Sample Input 0

5
-7 3 -5 2 4
Sample Output 0

140
Explanation 0

Product of -7, -5 and 4 will give 140.

 */

package java.Module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxProdOf3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        
        /*the max of 3 can be:
            - either multiplication of last three elements i.e. A[n-1]*A[n-2]*A[n-3]
            - or multiplication of first two element and third element i.e. A[0]*A[1]*A[n-1]
        
        */
        
        int ans1 = list.get(0)*list.get(1)*list.get(n-1);
        int ans2 = list.get(n-1)*list.get(n-2)*list.get(n-3);
        int max= 0;
        
        if(ans1 > ans2)
            max = ans1;
        else
            max = ans2;
                
        System.out.println(max);
     
    }
}
