/**
 * Created by aur2103 on 23/10/14.
 */
public class Util {
    public static int[][] randomIntMatrix(int x, int y){
        int[][] array = new int[x][y];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        return array;
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
