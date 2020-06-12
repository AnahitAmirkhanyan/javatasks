import java.util.Scanner;

public class DistAndMidpoint {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, dist, xmid, ymid;

        System.out.print("Enter first city's coordinates: ");
        x1 = sc.nextDouble(); y1 = sc.nextDouble();

        System.out.print("Enter second city's coordinates: ");
        x2 = sc.nextDouble(); y2 = sc.nextDouble();

        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        xmid = (x1 + x2)/2; ymid = (y1 + y2)/2;
        
        System.out.println("The distance is " + dist);
        System.out.println("The coordinates of the midpoint are: " + xmid + ", " + ymid);
    }
}