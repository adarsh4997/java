// https://www.hackerrank.com/challenges/largest-rectangle/problem

package java.Module2.Contest7;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'largestRectangle' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY h as parameter.
     */

    public static long largestRectangle(List<Integer> h) {
        List<List<Integer>> bStack = new ArrayList<>();
        Long max = Long.MIN_VALUE;
        int li, lh, n = h.size();
        
        for (int i = 0; i < n; i++) {
            li = i;
            
            while (!bStack.isEmpty() && (bStack.get(bStack.size() - 1).get(1) > h.get(i))) {
                li = bStack.get(bStack.size() - 1).get(0);
                lh = bStack.get(bStack.size() - 1).get(1);
                max = Math.max(max, (i - li) * lh);
                bStack.remove(bStack.size() - 1);
            }
            bStack.add(new ArrayList<>(Arrays.asList(li, h.get(i))));
        }
        for (int i = bStack.size() - 1; i >= 0 ; i--) {
            max = Math.max(max, (n - bStack.get(i).get(0)) * bStack.get(i).get(1));
        }
        
        return max;

    }

}

public class largestRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

