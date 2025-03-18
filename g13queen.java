import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class g13queen {
    public static void main(String[] args) {
        int n = 8; // You can change the board size here
        List<List<String>> solutions = sNQ(n);
        
        // Print all solutions
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
        System.out.println("Total Solutions: " + solutions.size());
    }

    public static List<List<String>> sNQ(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] brd = new char[n][n];
        
        // Initialize the board with '.'
        for (char[] r : brd) {
            Arrays.fill(r, '.');
        }
        
        // Start solving from row 0
        sol(brd, 0, res);
        return res;
    }

    public static void sol(char[][] brd, int r, List<List<String>> res) {
        if (r == brd.length) { // If all queens are placed, add to result
            res.add(cB(brd));
            return;
        }

        for (int col = 0; col < brd.length; col++) {
            if (isSafe(brd, r, col)) { // Check if placing a queen is safe
                brd[r][col] = 'Q'; // Place the queen
                sol(brd, r + 1, res); // Recur for the next row
                brd[r][col] = '.'; // Backtrack and remove the queen
            }
        }
    }

    private static List<String> cB(char[][] brd) {
        List<String> res = new ArrayList<>();
        for (char[] r : brd) {
            res.add(new String(r)); // Convert char[] to String
        }
        return res;
    }

    private static boolean isSafe(char[][] brd, int r, int col) {
        int n = brd.length;

        // Check column
        for (int i = 0; i < r; i++) {
            if (brd[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = r, j = col; i >= 0 && j >= 0; i--, j--) {
            if (brd[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = r, j = col; i >= 0 && j < n; i--, j++) {
            if (brd[i][j] == 'Q') return false;
        }

        return true;
    }
}
