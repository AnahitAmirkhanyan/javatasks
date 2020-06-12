import java.util.Scanner;

public class Calculator{

    public static void main(String[] args){
        double first, second, res = 0;
        char op;
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter two numbers: ");
        first = sc.nextDouble();
        second = sc.nextDouble();
        System.out.print("Enter + - * or /   :");
        op = sc.next().charAt(0);

        switch(op){
            case '+':
                res = first + second;
                break;
            case '-':
                res = first - second;
                break;
            case '*':
                res = first *second;
                break;
            case '/':
                res = first / second;
                break;
            default:
                System.out.println("Please enter one of the four operations");
                break;
        }

        System.out.println("The result is " + res);
        
    }
}