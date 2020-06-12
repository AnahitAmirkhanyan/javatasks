import java.util.Scanner;

public class Contains{

    public static void main(String[] args){

        int[] arr = new int[10];
        int num;
        boolean contains = false;

        for(int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random()*10); // 10 numbers in the range 0 - 9
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = sc.nextInt();

        for(int i = 0; i < 10; i++){
            if(arr[i] == num){
                contains = true;
                break;
            }
        }

        System.out.println(contains);

    }
}