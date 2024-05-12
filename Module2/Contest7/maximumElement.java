// https://www.hackerrank.com/challenges/maximum-element/problem

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
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        maxStack.push(Integer.MIN_VALUE);
        for(String e : operations){
            String[] op = e.split("\\s+");
            if(op[0].equals("1")){
                int num = Integer.parseInt(op[1]);
                stack.push(num);
                if(num > maxStack.peek()){
                    maxStack.push(num);
                }
                else{
                    maxStack.push(maxStack.peek());
                }
            }
            else if(op[0].equals("2")){
                stack.pop();
                maxStack.pop();
            }
            else{
                list.add(maxStack.peek());
            }
        }
        return list;
    }

}

public class maximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

