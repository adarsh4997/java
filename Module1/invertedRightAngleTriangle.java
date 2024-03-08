import java.util.Scanner;

/* Print this

    * * * * * 
    * * * *
    * * *
    * *
    *
 
 */
public class invertedRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int space=n;
        for(int row=0;row<n;row++){
            for(int i=0;i<space;i++){
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }
    }
}