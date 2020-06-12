import java.util.Arrays;

public class Doubling{

    public static int[] doubling(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] *= 2;
        }
        return arr;
    }

    public static void main(String[] args){
        int [] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(doubling(array)));
    }
}