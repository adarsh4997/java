import java.util.Scanner;

/* Print this
for n=7
      *******
       *****
        ***
         *
 
 */
public class invertedTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7;
        int star=n;
        int space=0;
        for (int row = 0; row < n; row++) {
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            System.out.println();
            star-=2;
            space++;
        }

    }
}