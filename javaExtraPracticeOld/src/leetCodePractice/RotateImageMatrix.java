package leetCodePractice;

import java.util.ArrayList;
import java.util.List;

public class RotateImageMatrix {

public static void rotate(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        }
        //int[] resultGroup = new int[matrix.length];
        //List<Integer> resultArray = new ArrayList<>();
        List<Integer>[] resultArray = new ArrayList[matrix.length];
        for(int j=0; j<matrix.length; j++){
        	resultArray[j]= new ArrayList<Integer>();
        	int k=0;
        	for(int i= matrix.length-1; i>=0; i--){
        		
            	result[j][k]= matrix[i][j];
            	
            	resultArray[j].add(matrix[i][j]);
            	k++;
                //System.out.print(" " +matrix[i][j]+" ");
            }
            //System.out.println();
            System.out.println(resultArray[j]);
        }
//       result[0][0]=matrix [2][0];
//       result[0][1]=matrix [1][0];
//       result[0][2]=matrix [0][0];
//       result[1][0]=matrix [2][1];
//       result[1][1]=matrix [1][1];
//       result[1][2]=matrix [0][1];
//       result[2][0]=matrix [2][2];
//       result[2][1]=matrix [1][2];
//       result[2][2]=matrix [0][2];
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[i].length; j++){
                System.out.print(" "+result[i][j]+" ");
            }
            System.out.println();
        }
       
       
    }
	public static void main(String[] args) {
		
		//int [][] matrix =  {{1,2,3},{4,5,6},{7,8,9}};
		//int [][] matrix =  {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		int[][] matrix = {{1,2},{3,4}};
		rotate(matrix);

	}

}
