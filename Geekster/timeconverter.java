import java.util.Scanner;

public class timeconverter {
    
    public int hourtominute(int hour){
        int minute= hour*60;
        return minute;
    }

    public int daystominute(int day){
        int minute= day*24*60;
        return minute;
    }

    public static void main(String[] args) {
        timeconverter ob=new timeconverter();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of hour: ");
        int h= sc.nextInt();
        System.out.println("Enter number of days: ");
        int d= sc.nextInt();
        System.out.println("hour to minute: "+ob.hourtominute(h));
        System.out.println("Day to minute: "+ob.daystominute(d));
    }
}
