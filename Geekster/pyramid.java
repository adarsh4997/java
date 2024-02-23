import java.util.Scanner;

/* Print this

         * 
        * *
       * * *
      * * * * 
     * * * * *
    * * * * * * 
   * * * * * * * 
 
 */
public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int star=0;
        int space=n-1;
        /* No of rows */
        for (int row = 0; row < n; row++) {
            /* No of Space in decreasing */
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            /* Incrementing stars */
            for (int i = 0; i <=star; i++) {
                System.out.print("* ");
            }
            System.out.println();
            star++;
            space--;
        }

    }
}