import java.util.Arrays;

public class TenPercent{

    public static double[] tenPercentByIndex(double[] arr, int index){
        arr[index] +=  arr[index]*0.1;
        return arr;
    }


    public static void main(String[] args){
        double[] arr = {1.453, 2.322, 6.4352, 87.243234, 54.232};
        System.out.println(Arrays.toString(tenPercentByIndex(arr, 2)));
    }
}