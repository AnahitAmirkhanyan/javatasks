import java.util.Arrays;

public class Copies{

    public static String[] copies3(String[] arr){

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + arr[i] + arr[i];
        }

        return arr;
    }


    public static void main(String[] args){
        // example array
        String[] array = {"abc", "def", "g", "hhh", "asd", "aa"};

        System.out.print(Arrays.toString(copies3(array)));
    }
}