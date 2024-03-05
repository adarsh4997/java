/*
In this problem, you're given two arrays:

Numbers Array: An array of numbers.
Indexes Array: An array of indexes.
Your task is to create a new array called the "Target Array." You do this by reading the elements from the Numbers Array and placing them in the Target Array at the positions specified by the corresponding elements in the Indexes Array.

Here's a step-by-step explanation:

Take an integer n as input, representing the size of both the Numbers Array and the Indexes Array.
Take n integer inputs for the Numbers Array elements.
Take n integer inputs for the Indexes Array elements, where each input should be a valid index in the range 0 to n-1.
Create a Target Array of size n.
For each element in the Numbers Array, place it in the Target Array at the position specified by the corresponding element in the Indexes Array.
Print the elements of the Target Array.
Let's consider a sample input:

input:
5
12 13 14 15 16
0 1 2 3 4
Here, the Target Array is created by placing each number at the corresponding index:

Target[0] = Numbers[0] = 12
Target[1] = Numbers[1] = 13
Target[2] = Numbers[2] = 14
Target[3] = Numbers[3] = 15
Target[4] = Numbers[4] = 16
So, the output would be the elements of the Target Array: 12 13 14 15 16.

*/

import java.util.*;

public class targetArray {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        //num array
        int[] nums= new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        //inx array
        int[] idx= new int[n];
        for (int i = 0; i < nums.length; i++) {
            idx[i]=sc.nextInt();
        }

        //logic
        int[] tar= new int[n];
        for (int i = 0; i < tar.length; i++) {
            tar[idx[i]]=nums[i];
        }
        
        for (int i = 0; i < tar.length; i++) {
            System.out.print(tar[i]+" ");
        }

     }
}