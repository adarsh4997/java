/*
Given a string str consisting of lowercase English letters indexed from 0, you must choose one index and delete the corresponding letter. This deletion should result in every letter appearing with the same frequency in the remaining string.

If it's possible to remove one letter from String to satisfy the aforementioned condition, return true; otherwise, return false

NOTE:-

The frequency of a letter x is the number of times it occurs in the string.

You must remove exactly one letter and cannot chose to do nothing.

Input Format

take String str as input.

Constraints

2 <= word.length <= 10^4

word consists of lowercase English letters only.

Output Format

return true; otherwise, return false

Sample Input 0

abcc
Sample Output 0

true
Sample Input 1

aazz
Sample Output 1

false
 */

package java.Module2.Contest6;

import java.util.*;

public class equallyFrequentLetters {

    public static boolean canDeleteLetter(String str) {
        // Count the frequency of each letter
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        // Check if removing any letter satisfies the condition
        for (char ch : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(ch);
            frequencyMap.put(ch, frequency - 1); // Simulate removing the letter
            
            // Check if all remaining letters have the same frequency
            Set<Integer> frequencies = new HashSet<>(frequencyMap.values());
            if (frequencies.size() == 1) {
                return true;
            }
            
            // Restore the original frequency for the next iteration
            frequencyMap.put(ch, frequency);
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        
        boolean result = canDeleteLetter(str);
        System.out.println(result);
    }
}

