import java.util.Scanner;

/* Print this

            *
          * *
        * * *
      * * * *
    * * * * *
 */
public class rightAngleTriangle {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= 5;
        int space=n-1;
        int star=1;
        /*for defining rows */
        for(int row=0;row<n;row++){
            /*for defining space in each row like first row has 4 space*/
            for (int i = 0; i < space; i++) {
                System.out.print("  ");
            }
            /* for defining * after spaces */
            for (int i = 0; i < star ; i++) {
                System.out.print(" *");
            }

            System.out.println();
            star++;
            space--;
            
        }
        
    }
}