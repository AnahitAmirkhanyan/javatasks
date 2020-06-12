import java.util.Arrays;

public class MatrixToArray{

    public static int[] matrixToArray(int[][] mat){
        int[] arr = new int[mat.length * mat[0].length];
        int k = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                arr[k++] = mat[i][j];
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[][] matrix = new int[5][7];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*10);
            }
        }

        System.out.println(Arrays.toString(matrixToArray(matrix)));

    
    }
}