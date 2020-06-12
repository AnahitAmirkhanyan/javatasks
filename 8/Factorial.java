import java.util.Scanner;

public class Factorial{


    public static int factorial(int num){
        if(num < 2) 
            return 1;
        else{
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args){
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println("The factorial of the number is " + factorial(num));
    }
}