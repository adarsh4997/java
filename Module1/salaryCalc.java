/*
Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -

   totalSalary = basic + hra + da + allow – pf
        where :
hra   = 20% of basic

da    = 50% of basic

allow = 1700 if grade = ‘A’

allow = 1500 if grade = ‘B’

allow = 1300 if grade = ‘C' or any other character

pf    = 11% of basic.
Round off the total salary and then print the integral part only.

Note: use functions.

Input Format

Basic salary & Grade (separated by space)

Constraints

0 <= Basic Salary <= 7,500,000
Output Format

Print Total Salary

Sample Input 0

10000
A
Sample Output 0

17600
Sample Input 1

4567
B
Sample Output 1

8762
Sample Input 2

3159
C
Sample Output 2

6323

 */





import java.util.Scanner;

public class salaryCalc {

    public static int salary(int b, char g) {
        double hra = 0.2 * b;
        double da = 0.5 * b;
        double pf = 0.11 * b;
        int allow;

        if (g == 'A') {
            allow = 1700;
        } else if (g == 'B') {
            allow = 1500;
        } else {
            allow = 1300;
        }

        double total = b + hra + da + allow - pf;
        int roundOff = (int) Math.round(total);

        return roundOff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        System.out.println(salary(basic, grade));
    }
}
