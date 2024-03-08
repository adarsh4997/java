import java.util.Scanner;

public class numberOfSteps {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();        //No of test case
        int i=1;
        while (i<=t) {
            int steps=0;
            int x= sc.nextInt();

            while (x>0) {
                if(x%2==0)
                    x-=1;
                else
                    x-=2;
                    steps++;
            }
            System.out.println(steps);
            i++;
        }
    }
}
