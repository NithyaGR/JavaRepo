package codePractice;

import java.util.Scanner;
import java.util.Stack;

public class MatrixPath {

	public static void main(String[] args) {
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the number of Testcase"); int noTestCases =
		 * scan.nextInt();
		 * 
		 * System.out.println("Enter the number of rows"); int rows = scan.nextInt();
		 * System.out.println("Enter the number of columns"); int cols = scan.nextInt();
		 * int[][] matrix = new int[rows][cols]; System.out.println("Enter the matrix");
		 * for(int i=0; i< rows; i++) { System.out.println("Enter the "+(i+1)
		 * +" row elements"); for(int j=0; j<cols; j++) { matrix[i][j] = scan.nextInt();
		 * } System.out.println(); }
		 * System.out.println("Enter the total sum for which the path need to be found"
		 * ); int total = scan.nextInt(); for(int i=0; i< rows; i++) {
		 * 
		 * for(int j=0; j<cols; j++) { System.out.print(matrix[i][j]+" "); }
		 * System.out.println(); }
		 */
		
		int[][] matrix = {{1,2,3},{4,5,6}};
		Stack<Integer> path = new Stack<>();
		
		int i=0, j=0; //starting cells
		findPaths(matrix,path,i,j);
//		scan.close();
	}

	private static void findPaths(int[][]matrix, Stack<Integer> path, int i, int j) {
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		// if the destination - final cell is reached - print it
		
		if(i == rows-1 && j == cols-1) {
			path.add(matrix[i][j]);
			System.out.println(path);
			path.pop();
			return;
			
		}
		
		//include the current cell in the path
		path.add(matrix[i][j]);
		
		//to move right
		
		if(i>=0 && i<rows && j+1 >=0 && j+1 <cols) {
			findPaths(matrix, path, i, j+1);
		}
		
		// to move down
		
		if(i+1 >=0 && i+1 <rows && j>=0 && j<cols) {
			findPaths(matrix, path, i+1, j);
		}
		
		//remove the current cell from the path
		path.pop();
				
			
		
		
	}

}
