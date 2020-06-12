import java.util.Arrays;

public class NoLong{

    public static String[] noLong(String[] arr, int num){
        int count = 0;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i].length() >= num){
        //         for(int j = i; j < arr.length - 1; j++){
        //             arr[j] = arr[j + 1];
        //         }
        //         count++;
        //         i--;
        //     }
        // }

        int i = 0;
        while(i < arr.length){
            if(arr[i] == null) break;

            if(arr[i].length() >= num){

                if(i == arr.length - 1){
                    count++;
                    break;
                }

                for(int j = i; j < arr.length - 1; j++){
                    arr[j] = arr[j + 1];
                    if(j == arr.length - 2) arr[j + 1] = null;
                }
                count++;
            } else i++;
        }
      
        arr = Arrays.copyOf(arr, arr.length - count);

        return arr;
    }

    public static void main(String[] args){
        String[] arr0 = {"this", "not", "too", "long", "bug", "no", "eternal", "a", "b", "oh"};
        String[] arr1 = {"a", "bbb", "cccc"};

        System.out.println(Arrays.toString(noLong(arr0, 4)));
        System.out.println(Arrays.toString(noLong(arr1, 4)));
    }
}