import java.util.Scanner;

public class Prime{

    public static boolean isPrime(int num){

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if(isPrime(number)){
            System.out.println("Yes it is prime");
        }else{
            System.out.println("Is not a prime number");
        }
    }
}