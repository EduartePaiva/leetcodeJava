package leetcode;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        boolean cache[];

        // check columns
        for (int r = 0; r < rows; r++) {
            cache = new boolean[10];
            for (int c = 0; c < cols; c++) {
                if (board[r][c] != '.') {
                    var index = board[r][c] - '0' - 1;
                    if (cache[index]) {
                        return false;
                    }
                    cache[index] = true;
                }
            }
        }

        // check rows
        for (int c = 0; c < cols; c++) {
            cache = new boolean[10];
            for (int r = 0; r < rows; r++) {
                if (board[r][c] != '.') {
                    var index = board[r][c] - '0' - 1;
                    if (cache[index]) {
                        return false;
                    }
                    cache[index] = true;
                }
            }
        }

        // check 3x3 squares

        for (int r = 0; r < rows / 3; r++) {
            for (int c = 0; c < cols / 3; c++) {

                // check 3x3
                cache = new boolean[10];

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int row = r * 3 + i;
                        int col = c * 3 + j;

                        if (board[row][col] != '.') {
                            var index = board[row][col] - '0' - 1;
                            if (cache[index]) {
                                return false;
                            }
                            cache[index] = true;
                        }

                    }
                }

            }
        }

        return true;
    }
}
