import java.util.ArrayList;
import java.util.Arrays;

public class Categorize{

    public static boolean isPrime(int num){

        if(num == 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] array = new int[20];
        System.out.print("The original array : ");
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        // Going to use Arraylist instead of array since there is no way
        // to know the size beforehand

        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int i = 0; i < array.length; i++){
            if(isPrime(array[i])){
                prime.add(array[i]);
            }

            if(array[i] % 2 == 0){
                even.add(array[i]);
            } else odd.add(array[i]);
        }

        System.out.println();
        System.out.println("Prime: " + Arrays.toString(prime.toArray()));
        System.out.println("Even: " + Arrays.toString(even.toArray()));
        System.out.println("Odd: " + Arrays.toString(odd.toArray()));


    }
}