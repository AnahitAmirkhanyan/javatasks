import java.util.Scanner;

public class SumAvg{

    public static void main(String[] args){
        int n, m, min, max;
        int sum = 0;
        double avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to find the sum and average of all numbers between them : ");
        n = sc.nextInt();
        m = sc.nextInt();

        min = Math.min(n,m);
        max = Math.max(n,m);

        for(int i = min + 1; i < max; i++){
            sum += i;
        }
        
        avg = sum/(max - min - 1);

        System.out.println("Sum is : " + sum);
        System.out.println("Average is : " + avg);
    }
}