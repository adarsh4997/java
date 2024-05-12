/*
Take an array of size n with integer elements. And Print “true” if the array contains an element that occurs thrice and print “false” if the array otherwise.

Input Format

An integer number n representing size of array.

N integer inputs representing elements of array.

Constraints

1<=n<=100000

-100000<=arr[i]<=100000

Output Format

Boolean Value

Sample Input 0

7
1 1 2 2 3 3 3
Sample Output 0

true
Explanation 0

element 3 has occured three time.

Sample Input 1

5
1
1
1
1
1
Sample Output 1

false
 */

package java.Module2.Contest3;

import java.io.*;
import java.util.*;

public class tripleOccurence {
    public static boolean thric(int arr[], int num){
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                  count++;
            } 
            }
            if(count == 3){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int arr[] = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
    boolean ans = thric(arr, num);
    System.out.println(ans);
    }
}
