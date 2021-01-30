/* 
 * Hello and welcome!
 * Today's challenge: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
 * Only the original zeroes count - new zeroes don't cause that to happen.
 *
 *
 * */

/*** puzzle1 class
 * A challenge, but not being used as a class for objects***/
public class puzzle1 {
    
    /***zeroify
     * If a zero is found in the row of a given matrix, turns the whole row and column into zeroes
     * @param matrix: the 2D array of integers to be zero-ified***/
    public static void zeroify(int[][] matrix) { 
        //so this is a pass-by-value 2d array. maybe not great since it would technically copy it in and it could be very large. Suppose we created a "matrix" class, one of whose attributes was a 2d array, that could be better...
        //in c you would get a segfault and in rust you wouldn't even compile beause those languages are pass-by-reference

        /* Game plan
         * Keep a 1d array each of rows and columns
         *      To avoid repeats. set row to 1 if it needs zero-ing
         *      java arrays automatically filled with 0s no null worries
         * For each row r:
         *      For each element of row c:
         *              is [r][c] zero?
         *              yes: push rows[r] to 1, set columns[c] to 1
         *                    
         * At the end, go through each element of the row array and zero-ify
         * Go through each element of the column array and zero-ify
         *
         * Runtime analysis: Omega(r * c) r = rows c = columns.
         *      looks at all elements in the matrix...
         *      goes through only twice maximum if all r and c have a 0
         * */
        int numRows = matrix[][0].length;
        int numCols = matrix[0][].length;
        int[] rows = new int[numRows];
        int[] columns = new int[numCols];
        for (int r = 0; r < numRows; r++){
            for (int c = 0; c < numCols; c++) {
                if (matrix[r][c] == 0) {
                    rows[r] = 1;
                    columns[c] = 1;
                }
            }
        }
        for (int r = 0; r < numRows; r++) {
            if (rows[r] == 1) {
                for (int c = 0; c < numCols; c++){
                    matrix[r][c] = 0;
                }
            }
        }
        for (int c = 0; c < numCols; c++) {
            if (columns[c] == 1) {
                 for (int r = 0; r < numRows; r++){
                    matrix[r][c] = 0;
                } 
            }
        }
    }

    public static void main(string[] args) {

    

    }

}
