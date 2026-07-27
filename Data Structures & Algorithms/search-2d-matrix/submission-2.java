class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = searchColumn(0, matrix.length-1, matrix, target);
        if (row == -1) return false;
        int col = searchRow(0, matrix[0].length-1, matrix, target, row);
        if (col == -1) return false;
        return true;
    }

    public int searchColumn(int top, int bottom, int[][] matrix, int target) {
        if (bottom < top) return -1;
        int mid = top+(bottom-top)/2;
        int lastCol = matrix[0].length-1;
        if (matrix[mid][0] > target)
            return searchColumn(top, mid-1, matrix, target);
        if (matrix[mid][lastCol] < target)
            return searchColumn(mid+1, bottom, matrix, target);
        return mid;
    }

    public int searchRow(int top, int bottom, int[][] matrix, int target, int row) {
        if (bottom < top) return -1;
        int mid = top+(bottom-top)/2;
        if (matrix[row][mid] == target)
            return mid;
        if (matrix[row][mid] > target)
            return searchRow(top, mid-1, matrix, target, row);
        return searchRow(mid+1, bottom, matrix, target, row);
    }
}
