import java.util.Scanner;

public class leapyear {

    public  boolean isLeapYear(int year){
        if(year%4==0 && year%100!=0 || year%400==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        leapyear ob= new leapyear();
        Scanner sc= new Scanner(System.in);
        int y= sc.nextInt();
        System.out.println(ob.isLeapYear(y));
    }
}
