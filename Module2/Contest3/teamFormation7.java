/*
You are given a positive integer array skill of even length N where skill[i] denotes the skill of the ith player. Divide the players into n/2 teams of size 2 such that the total skill of each team is equal.

The chemistry of a team is equal to the product of the skills of the players on that team.

Return the sum of the chemistry of all the teams, or return -1 if there is no way to divide the players into teams such that the total skill of each team is equal.

Input Format

The first line contains N, i.e. the size of the array.

The second line contains N space-separated positive integers skills[i] denoting elements of the array.

Constraints

2 <= N <= 10^5

N is even.

1 <= skill[i] <= 1000
Output Format

Return the sum of the chemistry of all the teams, or return -1 if there is no way to divide the players into teams such that the total skill of each team is equal.

Sample Input 0

6
3 2 5 1 3 4
Sample Output 0

22
Explanation 0

Divide the players into the following teams: (1, 5), (2, 4), (3, 3), where each team has a total skill of 6. The sum of the chemistry of all the teams is: 1 * 5 + 2 * 4 + 3 * 3 = 5 + 8 + 9 = 22.

Sample Input 1

2
3 4 
Sample Output 1

12
Explanation 1

The two players form a team with a total skill of 7. The chemistry of the team is 3 * 4 = 12.

Submissions: 28
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 

 */

package java.Module2.Contest3;

import java.io.*;
import java.util.*;

public class teamFormation7 {
    public static int teamFormation(int arr[], int num){
        Arrays.sort(arr);
        int targetsum = 0;
         for(int k = 0; k < num / 2; k++){
             targetsum += arr[k] + arr[num - k - 1];
         }
        for(int l = 0; l < num / 2; l++){
            if(arr[l] + arr[num - l - 1] != targetsum / (num / 2)){
                return - 1;
            }
        }
        int sumChem = 0;
        for(int m = 0; m < num / 2; m++){
            sumChem += arr[m] * arr[num - m - 1];
        }
        return sumChem;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int arr[] = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
    int a = teamFormation(arr, num);
    System.out.println(a);
    }
}
