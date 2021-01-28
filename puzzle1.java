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
        
        /* Game plan
         * Keep a stack of rows and an array of columns that need zero-ifying
         *      To avoid repeats
         * For each row r:
         *      For each element of row c:
         *              is [r][c] zero?
         *              yes: push r onto the row stack, set columns[c] to 1
         *                      break
         *              no: move along
         * At the end, go through each element of the row stack and zero-ify
         * Go through each element of the column array, if zero, then zero-ify
         * */

        for (int i = 0
    }

    public static void main(string[] args) {

    

    }

}
