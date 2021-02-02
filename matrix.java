/* 
 * Hello and welcome!
 * Today's challenge: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
 * Only the original zeroes count - new zeroes don't cause that to happen.
 * Decided to brush up on my OOP by making a class as well.
 *
 *
 * */

/*** matrix class
 * Contains a 2d array of integers and several methods for operations that can be performed on them. The methods are based on puzzles and aren't actual mathematical matrix operations.
 * ***/
public class Matrix {

    private int[][] arr;
    private int numRows;
    private int numCols;

    public Matrix(int rows, int columns) 
    {
        arr = new int[rows][columns];
        numRows = rows;
        numCols = columns;
        
    }
    public Matrix(){
        arr = new int[10][10];
        numRows = 10;
        numCols = 10;
    }

    public Matrix(int[][] arr) {
        this.arr = arr;
        numRows = arr[][0].length;
        numCols = arr[0][].length;
    }

    public int getNumCols() {
        return numCols;
    }
    
    public int getNumRows() {
        return numRows;
    }

    public void printMatrix() {
        System.out.println();
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                System.out.print(" [" + arr[r][c] + "] ");
            }
            System.out.println();
        }
    }

    public void setIndex(int x, int y, int val) {
        if (x >= numRows || y >= numCols) {
            System.out.println("Index out of bounds");
        }
        else {
            arr[x][y] = val;
        }
    }
    
    /***zeroify
     * If a zero is found in the row of the matrix, turns the whole row and column into zeroes **/
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
     
    public void zeroify() {
        int[] rows = new int[numRows];
        int[] columns = new int[numCols];
        for (int r = 0; r < numRows; r++){
            for (int c = 0; c < numCols; c++) {
                if (arr[r][c] == 0) {
                    rows[r] = 1;
                    columns[c] = 1;
                }
            }
        }
        for (int r = 0; r < numRows; r++) {
            if (rows[r] == 1) {
                for (int c = 0; c < numCols; c++){
                    arr[r][c] = 0;
                }
            }
        }
        for (int c = 0; c < numCols; c++) {
            if (columns[c] == 1) {
                 for (int r = 0; r < numRows; r++){
                    arr[r][c] = 0;
                } 
            }
        }
    }

    public static void main(string[] args) {
    }

}
