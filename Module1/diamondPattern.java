import java.util.Scanner;

/* Print this

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 
 */
public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int star=0;
        int space=N-1;
        for (int row = 0; row < ((2*N)-1); row++) {
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <=star; i++) {
                System.out.print("*");
            }
            if (row<N-1) {
                star+=2;
                space-=1;
            }
            else{
                star-=2;
                space+=1;
            }
            System.out.println();   
        }  
    }
}