import java.io.*;
import java.util.*;

public class runSumCalc {
        public static void main(String args[]){ 
            Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                sum+=num;
                System.out.print(sum+" ");
            }
            
    }
}          
       
