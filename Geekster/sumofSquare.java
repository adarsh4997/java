import java.util.Scanner;

public class sumofSquare {
    long sum=0;
    public int calculateSumofSquare(long n){
        // int result= (n*(n+1))*((2*n)+1)/6;
        for(int i=1; i<=n;i++){
            sum= sum+i*i;
        }
        return (int) sum;
    }
    public static void main(String[] args) {
        sumofSquare ob= new sumofSquare();
        Scanner sc= new Scanner(System.in);
        long x= sc.nextLong();
        System.out.println(ob.calculateSumofSquare(x));
    }
}
