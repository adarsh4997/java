import java.io.*;
import java.util.*;

public class pattern {
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Method 1
        // for (char ch = 'A'; ch <= 'Z'; ch += 2) {
        //     System.out.println(""+ch+(char)ch+(char)ch);
        //     char ans= Character.toLowerCase((char)(ch+1));
        //     System.out.println(""+ans+ans);
        // }

        // Method 2
        char ch='A';
        for(int i=1;i<=26;i++){
            if(i%2!=0)
                System.out.println(""+ch+ch+ch);
            else{
                char ans= Character.toLowerCase(ch);
                System.err.println(""+ans+ans);
            }
            ch+=1;
                
        }


    }
       
}
