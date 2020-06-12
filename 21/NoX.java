import java.util.Arrays;

public class NoX{

    public static String[] noX(String[] arr){
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) == 'x'){
                    arr[i] = arr[i].substring(0, j) + arr[i].substring(j + 1);
                    j--;
                }
            }
        }


        return arr;
    }


    public static void main(String[] args){
        String[] arr = {"xxax", "xbxbx", "xxcx", "xxxx"};
        System.out.print(Arrays.toString(noX(arr)));
    }
}