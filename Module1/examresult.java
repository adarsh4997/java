import java.util.Scanner;

public class examresult {
    public boolean isPass(int marks){
            return marks>50;
    }
    public static void main(String[] args) {
        examresult ob= new examresult();
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println(ob.isPass(m));

    }
}
