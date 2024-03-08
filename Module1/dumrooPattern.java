import java.util.Scanner;

/* Print this

   Note:  This pattern contains tabs in rows
   
 *       *       *       *       *

        *       *       *

                *

        *       *       *

*       *       *       *       *
 
 */
public class dumrooPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int star=N;
        int space=0;
        for (int row = 0; row < N; row++) {
            for (int i = 0; i < space; i++) {
                System.out.print("\t");
            }
            for (int i = 0; i <star; i++) {
                System.out.print("*\t");
            }
            if (row<(N/2)) {
                star-=2;
                space+=1;
            }
            else{
                star+=2;
                space-=1;
            }
            System.out.println();   
            System.out.println();   
        }    
    }
}