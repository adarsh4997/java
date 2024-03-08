/* 
Take n as an integer input. Then take n digits as integer inputs and form a number from it and print that number as an integer output.

Input Format

For each test case, n will be given as an integer input in the first line,

then n digits will be given as integer inputs in each line.

Constraints

1 <= n <= 2^3

0 <= digits as integer inputs <= 9
Output Format

Print the final number as an integer output.

Sample Input 0

4
1
2
3
6
Sample Output 0

1236
Sample Input 1

5
1
2
3
6
7
Sample Output 1

12367
Sample Input 2

6
8
5
6
7
8
9
Sample Output 2

856789
Sample Input 3

3
4
5
8
Sample Output 3

458
Sample Input 4

2
7
9
Sample Output 4

79

*/




import java.util.Scanner;

public class numberFormReverse {
    static void rev(int result){
        int temp=1;
        while (result>0) {
            int rem= result%10;
            temp=(temp*10)+rem;
            result/=10;
            System.out.print(rem);
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result=0;
        while (t>0) {
            int n= sc.nextInt();
            result=(result*10)+n;
            t--;
        }
        System.out.println(result);
        rev(result);
    }
}
