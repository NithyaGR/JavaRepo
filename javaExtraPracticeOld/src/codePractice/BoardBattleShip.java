package codePractice;

import java.util.HashMap;
import java.util.Map;

public class BoardBattleShip {
	
	public static int countBattleships(char[][] board) {
		int count = 0;
		int charCount=0;
		Map <Integer, Integer> map = new HashMap<>();
		
        for(int i=0; i< board.length; i++){
        	charCount=0;
            for (int j=0; j<board[i].length; j++){
            	
                if(board[j][i] == 'x') {
                	//count++;
                	charCount++;
                	System.out.println(j);
                	System.out.println(charCount);
                	
                }
                map.put(i, charCount);
            }
        }
        System.out.println(map);
        for (Integer val : map.values()) {
        	if(val != board.length) {
        		count=count+val;
        	}
        	else {
        		count = count + 1;
        	}
		}
    
        return count;
    }
	public static void columnSum(int[][] arr) {
		int[] colSum = new int[arr[0].length];
        for(int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
 
                	colSum[j] = colSum[j]+arr[i][j];
            }
        }
        for(int k=0; k<colSum.length; k++) {
        	System.out.println(colSum[k]);
        }
        
	}
	public static void main(String[] args) {
		char[][] bs = {{'x', '.', '.','x'},{'.', '.', '.','x'},{'.', '.', '.','x'},{'.', '.', '.','x'}};
		//[["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]]
		int[][] arr = {{1,2,3}, {4,5,6},{7,8,9},{10,11,12}};
		//columnSum(arr);
		printColumnwise(arr);
		//System.out.println(countBattleships(bs));
	}
	private static void printColumnwise(int[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				//System.out.println(i);
				//System.out.println(j);
				//System.out.println("arr["+]+arr[i][j]+i+" "+j);
				System.out.println(arr[j][i]+j+" "+i);
			}
			System.out.println();
		}
		/*
		 * int row = 0; while(row<arr.length) { for(int j=0; j<arr[0].length; j++) {
		 * System.out.println(arr[j][row]); } row++; }
		 */
		
	}

}
/*
 * x..x
 * ...x
 * ...x
 * ...x
 * 
 * 
 * 
 * 
 */
