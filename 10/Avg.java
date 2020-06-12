import java.util.Scanner;

public class Avg{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 10 numbers: ");
        // double[] arr = {};
        double sum = 0;

        for(int i = 0; i < 10; i++){
            sum += sc.nextDouble();
        }

        System.out.println("The average is " + sum / 10);

        
    }
}