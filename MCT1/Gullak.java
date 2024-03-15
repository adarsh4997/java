/*
Hercy wants to save money for his first car. He puts money in the Gullak bank every day. He starts by putting in 1 dollar on Monday, the first day. Every day from Tuesday to Sunday, he will put in 1 more than the day before. On every subsequent Monday, he will put in 1 more than the previous Monday. Given n, return the total amount of money he will have in the Gullak bank at the end of the nth day.

Input Format

An integer N.

Constraints

1 <= n <= 1000

Output Format

return the total amount of money.

Sample Input 0

4
Sample Output 0

10
Explanation 0

After the 4th day, the total is 1 + 2 + 3 + 4 = 10.

Sample Input 1

10
Sample Output 1

37
Explanation 1

After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
 */

package java.MCT1;
import java.io.*;
import java.util.*;

public class Gullak {
        
       public static int sum(int n){
        int total = 0; 
        int day = 1;
        int deposit = 1;
           
        for(int i = 1; i <= n; i++, day++) {
        total += deposit++;
        if (day == 7) {
            day = 0;
            deposit = i / 7 + 1;
        }
    }
    return total;
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
