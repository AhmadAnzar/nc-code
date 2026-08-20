class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;

        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                char c= board[i][j];

                if (c=='.') continue;

                int num = c-'1';

                int box = (i/3)*3 + (j/3);

                if (rows[i][num] || cols[j][num] || boxes[box][num]) {
                    return false;
                }
                rows[i][num] = true;
                cols[j][num] =true;
                boxes[box][num] = true;

            }
        }
        return true;
    }
}
