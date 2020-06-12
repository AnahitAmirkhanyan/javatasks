import java.util.Scanner;

public class Multiply{
    
    public static void main(String[] args){

        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        for(int i = 1; i < 11; i++){
            System.out.println(number + " x " + i + " = " + i * number);
        }
    }
}