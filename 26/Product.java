import java.util.Scanner;

public class Product{

    public static int product(int n){
        if(n == 1) return 1;
        else return n*product(n - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N to calculate the product from 1 to N: ");
        int n = sc.nextInt();
        System.out.println( "The product is: " + product(n));
    }
}