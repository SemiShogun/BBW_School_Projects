public class DameProblem {
    private int size;
    private int[][] board;
    private static final int FIELD_FREE = 0;
    private static final int FIELD_OCCUPIED = 1;

    public DameProblem(int size) {
        this.size = size;
        this.board = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                board[i][j] = FIELD_FREE;
            }
        }
    }

    public int[][] getBoard() {
        return board;
    }

    public boolean setQueen(int row) {
        if (row >= size) {
            return true;
        }

        for(int column = 0; column < size; column++) {
            if(isValid(row, column)) {
                board[row][column] = FIELD_OCCUPIED;
                if(setQueen(row + 1)) {
                    return true;
                } else {
                    board[row][column] = FIELD_FREE;
                }
            }
        }
        return false;
    }

    public boolean isValid(int row, int column) {
        int h, k;
        for(h = 0; h < row; h++) {
            if(board[h][column] == FIELD_OCCUPIED) {
                return false;
            }
        }
        // Search diagonally to the left side up
        h = row - 1;
        k = column - 1;
        while ((h >= 0) && (k >= 0)) {
            if(board[h--][k--] == FIELD_OCCUPIED) {
                return false;
            }
        }
        // Search to the right up
        h = row - 1;
        k = column + 1;
        while((h >= 0) && (k < size)) {
            if(board[h--][k++] == FIELD_OCCUPIED) {
                return false;
            }
        }
        return true;
    }
}
