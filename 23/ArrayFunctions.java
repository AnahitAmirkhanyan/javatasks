import java.util.Arrays;

public class ArrayFunctions{

    public static int[] concat(int[] arr0, int[] arr1){
        int[] arr = new int[arr0.length + arr1.length];
        int k = 0, i = 0, j = 0;

        while(i < arr0.length){
            arr[k++] = arr0[i++];
        }

        while(j < arr1.length){
            arr[k++] = arr1[j++];
        }


        return arr;
    }

    public static double AvgSum(int[] arr0, int[] arr1){
        
        double sum0 = 0, sum1 = 0;
        double avg0, avg1;

        for(int i = 0; i < arr0.length; i++){
            sum0 += arr0[i];
        }
        avg0 = sum0/arr0.length;

        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
        }
        avg1 = sum1/arr1.length;

        return avg0 + avg1;
    }


    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10,11};
        System.out.println(Arrays.toString(concat(a, b)));
        System.out.println(AvgSum(a, b));
    }
}