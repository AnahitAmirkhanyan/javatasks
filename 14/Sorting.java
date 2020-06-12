import java.util.Arrays;

public class Sorting{

    // using Selection Sort (worst case complexity O(n^2))

    public static int[] ascending(int[] arr){

        int min, tmp;
        for(int i = 0; i < arr.length; i++){
            min = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            if(min != i){
                tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }

        return arr;
    }

    public static int[] descending(int[] arr){
        int max, tmp;
        for(int i = 0; i < arr.length; i++){
            max = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }

            if(max != i){
                tmp = arr[max];
                arr[max] = arr[i];
                arr[i] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        
        int[] array = new int[20];
        System.out.print("The original array : ");
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Ascending order : " + Arrays.toString(ascending(array)));
        System.out.println("Descending order : " + Arrays.toString(descending(array)));

    }
}