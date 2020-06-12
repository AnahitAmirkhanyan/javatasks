import java.util.Scanner;

public class Moonweight{
    
    public static void main(String[] args){
        System.out.print("Please enter your weight: ");
        double weight;

        Scanner sc = new Scanner(System.in);
        weight = sc.nextDouble();
        sc.close();

        System.out.println("Your weight on the moon is " + weight*17/100);
    }
}