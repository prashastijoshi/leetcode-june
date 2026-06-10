class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int r = m*n - 1;
        
        

        while(l<=r){
            int mid = (l+r)/2;
            int a = mid/n;
            int b = mid%n;

            if(matrix[a][b] == target){
                return true;
            }
            else if(matrix[a][b] > target){
                r = (n*a) + b -1;
            }
            else{
                l = (n*a) +b + 1;
            }
        }
        return false;
        
    }
}