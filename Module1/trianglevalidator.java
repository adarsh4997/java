import java.util.Scanner;

public class trianglevalidator {
    public boolean isRightAngle(int base, int height, int hypotenuse){
        return hypotenuse*hypotenuse==base*base+height*height;
    }
    public static void main(String[] args) {
        trianglevalidator ob= new trianglevalidator();
        Scanner sc = new Scanner(System.in);
        int b= sc.nextInt();
        int h= sc.nextInt();
        int h1= sc.nextInt();
        System.out.println(ob.isRightAngle(b, h, h1));

    }
}
