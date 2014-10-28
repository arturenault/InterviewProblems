/**
 * Created by aur2103 on 23/10/14.
 */
public class MatrixZeroRowColumn {
    public static void main(String args[]){
        int[][] matrix = Util.randomIntMatrix(10, 10);
        Util.printMatrix(matrix);
        boolean[] zeroRows = new boolean[matrix.length];
        boolean[] zeroCols = new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            if(zeroRows[i]){
                matrix[i] = new int[matrix[i].length];
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(zeroCols[j]) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        Util.printMatrix(matrix);

    }
}
