/*
Find common elements in two ArrayLists in Java.

Input Format

first line contain N no of elements in list 1, third line contain M elements of list 2 then subsequent lines contain list elements.

Constraints

1<=N,M<=100

Output Format

print common elements with space

Sample Input 0

4
Hii Geeks for Geeks
3
Hii Geeks Gaurav
Sample Output 0

Hii Geeks Geeks
 */

package java.Module2.Contest6;

import java.io.*;
import java.util.*;

public class commonElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list1 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list1.add(sc.next());
        }
        
        int m = sc.nextInt();
        ArrayList<String> list2 = new ArrayList<>();
        for(int i = 0; i < m; i++){
            list2.add(sc.next());
        }
        
        ArrayList<String> list3 = new ArrayList<>(list1);
        list3.retainAll(list2);
        
        for (String element : list3) {
            System.out.print(element + " ");
        }
    }
}

