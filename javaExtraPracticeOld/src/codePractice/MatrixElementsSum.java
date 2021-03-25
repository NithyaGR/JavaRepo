package codePractice;

public class MatrixElementsSum {
	static int matrixElementsSum(int[][] matrix) {
	    int sum = 0;

	    for(int i=0; i< matrix.length; i++){
	        for( int j=0; j<matrix[i].length; j++){
	            if(i == 0) {
	            	sum = sum + matrix[i][j];
	            }
	            if(i >0  && matrix[i-1][j] !=0 && matrix[0][j] !=0) {
	            	sum = sum + matrix[i][j];
	            }
	            
	        }
	    }
	    return sum;
	}


	public static void main(String[] args) {
		int[][] matrix = {{1, 1, 1, 0}, 
		          {0, 5, 0, 1}, 
		          {2, 1, 3, 10}};
		System.out.println(matrixElementsSum(matrix));

	}

}
