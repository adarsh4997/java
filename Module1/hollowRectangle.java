import java.util.Scanner;

/* Print this

    *****
    *   *
    *   *
    *   *
    *   *
    *   *
    *   *
    *****
 
 */
public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();  //5
        int n=sc.nextInt();  //8
        for (int row = 0; row < n; row++) {
            if(row==0 || row==n-1){
                //m stars
                for(int i=0; i<m; i++){
                    System.out.print("*");
                }
            }
            else{ //* m-2 *
                System.out.print("*");
                for(int i=0; i<m-2; i++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}