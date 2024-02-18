import java.io.*;
import java.util.*;

public class AlternateCharacters {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            String str= sc.nextLine();          
            char[] ch= str.toCharArray();       //converting to Character Array
            for (int i=0;i<str.length();i++) {          //loop for printing odd spaces
                if(i%2==0) 
                    System.out.print(str.charAt(i));
            }
        }
    }          
       
