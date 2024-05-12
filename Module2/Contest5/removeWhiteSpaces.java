/*
Write a Java Program to remove all white spaces from a string without using replace().

Input Format

First and only line of input contains String s.

Constraints

1<=s.length()<=10^4

Output Format

Print string after removing white spaces.

Sample Input 0

Saket Saurav        is an Autom ation Engi ne      er
Sample Output 0

SaketSauravisanAutomationEngineer
Sample Input 1

geekst er    is b   e s t
Sample Output 1

geeksterisbest
 */

package java.Module2.Contest5;

import java.io.*;
import java.util.*;

public class removeWhiteSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            else{
                str += s.charAt(i);
            }
        }
        System.out.print(str);
    }
}
