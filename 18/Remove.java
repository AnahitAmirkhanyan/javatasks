import java.util.Arrays;
import java.util.Scanner;

public class Remove{

    public static int[] removeAt(int[] arr, int index){

        for(int i = index; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }

        return Arrays.copyOf(arr, arr.length - 1);
    }

    public static void main(String[] args){
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Enter index to remove number : ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        System.out.println(Arrays.toString(removeAt(array, index)));
    }
}