class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // If the first letter matches, start the deep search
                if (board[i][j] == word.charAt(0)) {
                    if (find(board, word, i, j, 0)) return true;
                }
            }
        }
        return false; // Return false only after checking every cell
    }

    boolean find(char[][] board, String word, int row, int col, int idx) {
        // Base case: All characters in the word have been matched
        if (idx == word.length()) return true;

        // Boundary checks and character mismatch check
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length 
            || board[row][col] != word.charAt(idx)) {
            return false;
        }

        // Action: Mark the current cell as visited
        char temp = board[row][col];
        board[row][col] = '#';
        // Recurse: Check all 4 directions (Up, Down, Left, Right)
        boolean found = find(board, word, row + 1, col, idx + 1) ||
                        find(board, word, row - 1, col, idx + 1) ||
                        find(board, word, row, col + 1, idx + 1) ||
                        find(board, word, row, col - 1, idx + 1);

        // Backtrack: Restore the original character for other search paths
        board[row][col] = temp;

        return found;
    }
}
