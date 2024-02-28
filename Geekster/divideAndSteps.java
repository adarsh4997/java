/*
Take a natural number n as an integer input, and variable steps of integer type as input. Then perform the following operations on it.

a. If the number is divisible by 2, then keep on dividing the number n by 2, till the time the number is divisible by 2 and also increment the variable steps by 2, each time you divide the number by 2.

b. Also, check If the number is divisible by 3, then keep on dividing the number n by 3, till the time the number is divisible by 3 and also increment the variable steps by 3, each time you divide the number by 3.

c. Also, If the number is divisible by 5, then keep on dividing the number n by 5, till the time the number is visible by 5 and also increment the variable steps by 5, each time you divide the number by 5.

In the end print the value of the variable steps in the first line and final value of number n in the second line.

Input Format

For each test case, n will be given in the first line,

steps will be given in the second line.

Constraints

1 <= n <= 2^31-1

-2^31 <= steps <= 2^31-1
Output Format

Print the final value of steps in the first line as an integer output,

and print the final remaining value of n in the second line as an integer output.

Sample Input 0

30
0
Sample Output 0

10
1
Sample Input 1

100
20
Sample Output 1

34
1
Sample Input 2

210
7
Sample Output 2

17
7
Sample Input 3

243
0
Sample Output 3

15
1
Sample Input 4

700
0
Sample Output 4

14
7


*/


import java.io.*;
import java.util.*;

public class divideAndSteps {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int steps= sc.nextInt();
        while(n%2==0){
            n/=2;
            steps+=2;
        }
        while(n%3==0){
            n/=3;
            steps+=3;
        }
        while(n%5==0){
            n/=5;
            steps+=5;
        }
        
        System.out.println(steps);
        System.out.println(n);
        
    }
}