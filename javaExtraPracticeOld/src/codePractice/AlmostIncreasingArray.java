package codePractice;

import java.util.ArrayList;
import java.util.List;

public class AlmostIncreasingArray {

	static boolean almostIncreasingSequence(int[] sequence) {
		 boolean almostIncreasingSequence = false;
		 List<Integer> copy1 = new ArrayList<>();
		 List<Integer> copy2 = new ArrayList<>();
		   List<Integer> list = new ArrayList<Integer>();
		   for(Integer number:sequence) {
		         list.add(number);
		      }
		   System.out.println(list);
		   //if the size is 2 - no matter whether first or last elements matche, it's true - as
		   // you can remove one element make it almost true.
		   if(list.size() == 2 || list.size() == 1) {
			       almostIncreasingSequence = true;
			   }
		   //if the size more than 2 - first check for first and last elements matches
		   else {
			   if(list.get(0)== list.get(list.size()-1)) { //check for inner elements whether ascending
				   loop:
					   for(int i=1; i<list.size(); i++) {
						   if(i != list.size()-1 && list.get(i)<list.get(i+1)) {
//							   System.out.println(i);
//							   System.out.println(list.get(i));
//							   System.out.println(list.get(i+1));
							   almostIncreasingSequence = true;
							   break loop;
						   }
					   }
			   }
			   //if inner elements are not ascending remove the first element where it's not ascending
			   else {
				   outerloop:
				   for(int i=0; i<list.size(); i++) {
					   if(i != list.size()-1 && list.get(i)>=list.get(i+1)) {
						   
						   copy1.addAll(list);
						   copy1.remove(i);
						   copy2.addAll(list);
						   copy2.remove(i+1);
						   break outerloop;
					   }
				   }
				   System.out.println("*************");
				   System.out.println(copy1);
				   System.out.println(copy2);
				   
				   almostIncreasingSequence = checkAscending(copy1) || checkAscending(copy2);
			   }
		   }   
	return almostIncreasingSequence;
	}
	static boolean checkAscending(List<Integer> list) {
		for(int i=0; i<list.size(); i++) {
			if( i != list.size()-1 && list.get(i)>= list.get(i+1)) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		int[] test= {1, 1, 1, 2, 3};
		System.out.println(almostIncreasingSequence(test));
		//{3, 5, 67, 98, 3}
		
	}
}
/*
 * 		  
 * test cases 
 * first element and the last element are same with no elements in between
 * first and the last elements are same but inside elements are in ascending order
 * first and last elements are same but inside elements are not ascending
 *     
		   if (list.get(0)== list.get(1)
			   ||list.get(list.size()-2) == list.get(list.size()-1)) {
			   almostIncreasingSequence = false;
			   
		   }
		   else {
			   
			   outer:
			   for(int i=0; i<list.size(); i++) {
				   if(i != list.size()-1 && list.get(i)>list.get(i+1)) {
					   count++;
					   System.out.println(count);
					   almostIncreasingSequence = false;
					   break outer;
					   
				   }
			   }
		   }

 */
