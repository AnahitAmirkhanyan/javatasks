public class MinAndMax{

    public static void main(String[] args){
        int[] array = new int[10];
        int min, max;
        System.out.print("The array : ");

        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i] + " ");
        }

        min = max = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];
        }

        System.out.println();
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}