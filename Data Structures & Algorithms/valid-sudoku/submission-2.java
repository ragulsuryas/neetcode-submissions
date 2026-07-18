class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                // grid
                Set<Character> grid = new HashSet<>();
                if (i%3==0 && j%3==0) {
                    for (int k=i; k<i+3; k++) {
                        for (int l=j; l<j+3; l++) {
                            if (board[k][l]=='.')
                                continue;
                            if (grid.contains(board[k][l]))
                                return false;
                            grid.add(board[k][l]);
                        }
                    }
                }
                // row
                Set<Character> row = new HashSet<>();
                if (j==0) {
                    for (int k=0; k<9; k++) {
                        if (board[i][k]=='.')
                            continue;
                        if (row.contains(board[i][k]))
                            return false;
                        row.add(board[i][k]);
                    }
                }
                // col
                Set<Character> col = new HashSet<>();
                if (i==0) {
                    for (int k=0; k<9; k++) {
                        if (board[k][j]=='.')
                            continue;
                        if (col.contains(board[k][j]))
                            return false;
                        col.add(board[k][j]);
                    }
                }
            }
        }
        return true;
    }
}
