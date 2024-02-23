import java.util.Scanner;

/* Print this

    *   *
    *   *
    *   *
    *   *
    *****
 
 */
public class hollowSquareWithoutTop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  //5
        for (int row = 0; row < n; row++) {
            if(row==n-1){
                //m stars
                for(int i=0; i<n; i++){
                    System.out.print("*");
                }
            }
            else{ //* m-2 *
                System.out.print("*");
                for(int i=0; i<n-2; i++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}