/*
Take two integer inputs x and y. Then print the gcd of these two numbers as an integer output.

Input Format

T will be given as an integer input representing the number of test cases.

For each test case,

x will be given as an integer input in the first line,

y will be given as an integer input in the second line.

Constraints

1 <= T <= 2^10
1 <= x , y <= 2^10
Output Format

Print the gcd as an integer output.

Sample Input 0

2
100 35
20 7
Sample Output 0

5
1
Sample Input 1

1
300 20
Sample Output 1

20


*/


import java.util.Scanner;

public class GCD {
    static int GCD(int x, int y){
        int res= Math.min(x,y);
        for (int i = res; i >0; i--) {
            if(x%i==0 && y%i==0){
                System.out.println(i);
                break;
            }
        }
    return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            GCD(x,y);
            t--;
        }
        
        
    }
}
