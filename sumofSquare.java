import java.util.Scanner;

public class sumofSquare {
    public int calculateSumofSquare(int n){
        int result= (n*(n+1))*((2*n)+1)/6;
        return result;
    }
    public static void main(String[] args) {
        sumofSquare ob= new sumofSquare();
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(ob.calculateSumofSquare(x));
    }
}
