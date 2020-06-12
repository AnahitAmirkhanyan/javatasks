import java.util.Scanner;

public class NextPrime{

	public static boolean isPrime(int num){


        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num, prime = 0;
		boolean on = true;
		boolean found;

		while(on){
			System.out.print("Enter a number to find the closest prime number (or 0 to terminate): ");
			num = sc.nextInt();
			if(num == 0){
				on = false;
				break;
			}

			found = false;

			while(!found){
				if(isPrime(num)){
					prime = num;
					found = true;
				}else{
					num++;
				}
			}

			System.out.println("The next prime number is " + prime);
		}
    }
}