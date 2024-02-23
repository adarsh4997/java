import java.util.Scanner;

/* Print this

    n=6, k=7
               7 
            7 14 
         7 14 21 
      7 14 21 28 
   7 14 21 28 35 
7 14 21 28 35 42 
 
 */
public class rightAngleNumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //6
        int k=sc.nextInt(); //7
        int space=n-1;
        int num=1;
        for (int row = 0; row<n; row++) {
            for (int i = 0; i <space; i++) {
                System.out.print(" "+"  ");
            }
            int res=k;
            for(int i=0;i<num;i++){
                System.out.print(res+" ");
                res+=k;
            }
            System.out.println();
            num++;
            space--;
        }
    }
}