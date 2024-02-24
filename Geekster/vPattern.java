import java.io.*;
import java.util.*;

public class vPattern {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        int m = cin.nextInt();
        int row = (m+1)/2;
        int star = m;
        int space = 0;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=space; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=star; j++){
                if(j==1 || j == star ){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
            space++;
            star-=2;
        }
        
    }
}