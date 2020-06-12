import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates{

    public static ArrayList<Integer> duplicates(int[] first, int[] second){
        ArrayList<Integer> dupl = new ArrayList<>(); // using arraylist because i can't know the size beforehand

        // sort the arrays first for more optimized comparison
        Arrays.sort(first);
        Arrays.sort(second);

        int i = 0, j = 0;

        while(i < first.length && j < second.length){
            if(first[i] == second[j] && !dupl.contains(first[i])){
                dupl.add(first[i]);
                i++;
            } else if(first[i] < second[j]){
                i++;
            } else{
                j++;
            }
        }

        return dupl;
    }

    public static void main(String[] args){
        int[] first = new int[10];
        int[] second = new int[10];

        for(int i = 0; i < first.length; i++){
            first[i] = (int)(Math.random() * 10);
        }

        for(int i = 0; i < second.length; i++){
            second[i] = (int)(Math.random() * 10);
        }

        System.out.println("First array : " + Arrays.toString(first));
        System.out.println("Second array : " + Arrays.toString(second));

        System.out.println("Duplicates : " + Arrays.toString(duplicates(first, second).toArray()));


    }
}