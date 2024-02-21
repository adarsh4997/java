import java.io.*;
import java.util.*;

public class characterOccurence {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            String str= sc.nextLine();
            int aCount=0;
            int sCount=0;
            for (int i = 0; i < str.length(); i++) {
                char ch= str.charAt(i);
                if(ch=='a' || ch=='A')
                    aCount++;
                else if(ch=='s' || ch=='S')
                    sCount++;
            }
            System.out.println(aCount+" "+sCount);
    }          
       
}