class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans=new int[matrix.length];
        for(int row=0;row<matrix.length;row++){
            ans[row]=Arrays.stream(matrix[row]).sum();
        }return ans;
    }
}