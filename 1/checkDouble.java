import java.util.Scanner;

public class checkDouble{

    public static void main(String[] args){
        System.out.print("Enter something to check if it is Double or not : ");

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        double d;

        if(input.contains(".")){
            try{
                d = Double.parseDouble(input);
                System.out.println("Yes it was a double.");
            }catch(NumberFormatException e){
                System.out.println("Not a double.");
            }
        } else{
            System.out.println("Not a double.");
        }
    }

}