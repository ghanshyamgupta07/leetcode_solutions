// transpose square in place
class Solution {
    public int[][] transpose(int[][] matrix) {       
         
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i!=j && i<j){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;                
                }
                
            }
        }
        
        return matrix;
        
    }
}


// transpose reactangle as well
class Solution {
    public int[][] transpose(int[][] matrix) {
       
        int [][] tranMatrix = new int[matrix[0].length][matrix.length];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               
                tranMatrix[j][i]= matrix[i][j];
                
                }
                
            }
               
        return tranMatrix;
        
    }
}