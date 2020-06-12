import java.util.Scanner;

public class Fibonacci{

    public static int fib(int n){
        if(n == 0 || n == 1) return n;
        
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args){
        System.out.println("Enter a number N to find out the Nth term in the Fibonacci sequence: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number is " + fib(n));
    }
}