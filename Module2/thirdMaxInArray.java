/*
Meet Tom, a data analyst who was tasked with analyzing a dataset that contained information about the sales of a retail company. Tom needed to find the third highest sales amount from the dataset.

Help Tom to write a program that take an array of sales amount as input and return the third highest sales amount in the array and If the third highest amount does not exist than return the highest amount.

NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of the question. Click here

Input Format

First line of input contains integer N representing the size of array.

Second line of input contains N integers representing the elements of array.

Constraints

1 <= nums.length <= 10^4

-2^31 <= nums[i] <= 2^31 - 1
Output Format

Return the third maximum element.

Sample Input 0

3
3 2 1
Sample Output 0

1
Explanation 0

The first distinct maximum is 3.

The second distinct maximum is 2.

The third distinct maximum is 1.

Sample Input 1

2
1 2
Sample Output 1

2
Explanation 1

The first distinct maximum is 2.

The second distinct maximum is 1.

The third distinct maximum does not exist, so the maximum (2) is returned instead.

 */

package java.Module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class thirdMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int n1 = sc.nextInt();
            list.add(n1);
        }
        
        Collections.sort(list);
        
        int count = 1;
        int ans = list.get(n - 1);
        for(int i = n - 2; i >= 0; i--){
            if (list.get(i) < ans) {
                ans = list.get(i);
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
        
        Integer res = count == 3 ? ans : Collections.max(list);
        System.out.println(res);
    
    }
}
