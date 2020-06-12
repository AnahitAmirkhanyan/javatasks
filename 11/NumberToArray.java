import java.util.Arrays;
import java.util.Scanner;

public class NumberToArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int size = Integer.toString(num).length();

        int [] arr = new int[size];
   
        for(int i = size - 1; i >= 0; i--){
            arr[i] = num % 10;
            num /= 10;
        }

        System.out.println(Arrays.toString(arr));
    }
}