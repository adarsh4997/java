import java.util.*;

public class perfectnumber {
    
    public void isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum=sum+i;
        }
        if(sum==n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect");
    }
    public static void main(String[] args) {
        perfectnumber ob= new perfectnumber();
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        ob.isPerfect(num);
    }
}
