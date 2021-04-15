package codePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.runner.Result;

public class GroupPeople {

	public static List<List<Integer>> groupThePeople(int[] gs) {
	    List<List <Integer>> ResultList = new ArrayList<>();
	        List<Integer> curList = null;
//	        List<Integer> newList = null;
	        int max = gs[0];
	        for(int i=1; i< gs.length; i++){
	            if(gs[i]>max){
	                max = gs[i];
	            }
	        }
	        int count = 1;
	        List<Integer> newList = null;
	        while(count <= max) {
	        	curList = new ArrayList<>();
	        	newList = new ArrayList<>();
	        	for(int i=0; i<gs.length; i++) {
	        	if(count == gs[i]) {
	        		
		        	if(curList.size() < gs[i]) {
		        		curList.add(i);
		        	}
					
					  else { 
						  newList.add(i);
						  
						  if(newList.size() > gs[i]) {
							  newList = new ArrayList<>();
							  newList.add(i);
							  
				        	}	
						  ResultList.add(newList);
					  }					 
	        	}	
	        }
	        count++;
            if(curList != null) {
            	ResultList.add(curList);
            }
//            if(newList != null) {
//            	ResultList.add(newList);
//            }
	        }
	        System.out.println(curList);
	        //System.out.println(newList);
	        //System.out.println(ResultList);
	        Iterator it = ResultList.iterator();
	        while(it.hasNext()) {
	        	List <Integer> l = (List<Integer>) it.next();
	        	//System.out.println(l.size());
	        	if(l.size() ==0) {
	        		it.remove();
	        	}
	        }
	        return ResultList;
	        
	    }
	public static void main(String[] args) {
		int[] group = {3,3,3,3,3,1,3};
		System.out.println(groupThePeople(group));

	}

}
/*
* 3,3,3,3,3,1,3 // [[5], [], [0, 1, 2, 3, 4, 6]][5],[0,1,2],[3,4,6]
* 2,1,3,3,3,2//[1], [0,5],[2,3,4]
*[2,2,1,1,1,1,1,1]//[[3], [4], [5], [6], [7], [2], [0, 1]]
* List<List <Integer>> ResultList = new ArrayList<>();
	        List<Integer> lis = null;
	        int max = groupSizes[0];
	        for(int i=1; i< groupSizes.length; i++){
	            if(groupSizes[i]>max){
	                max = groupSizes[i];
	            }
	        }
	        int count = 1;
	        while(count<= max){
	            
	            lis = new ArrayList<>();
	            for(int i=0; i<groupSizes.length; i++){
	                if(groupSizes[i] == count){
	                    lis.add(i);
	                }
	                
	            }
	            count++;
	            
	            ResultList.add(lis);
	            
	        }
	        
	        return ResultList;
	        ****************************
	        	        while(count<= max){
	            
	            lis = new ArrayList<>();
	            list = new ArrayList<>();
	           // List<Integer> list;
	            for(int i=0; i<groupSizes.length; i++){	
	                if(groupSizes[i] == count){						
						  if(lis.size() != count) { 
							  lis.add(i); 
							  
						  } else {
//							  if(list != null) {
							  
							  list.add(i);
							  //ResultList.add(list);
						  
						  }
	                }
	                
	            }
	            count++;
	            if(lis != null) {
	            	ResultList.add(lis);
	            }
//	            System.out.println("lis is "+lis);
//	            
//	            System.out.println(" List is"+list);
	            if(list != null) {
	            	ResultList.add(list);
	            }
	        }
	        System.out.println(ResultList);
	        System.out.println(ResultList.size());
	        Iterator it = ResultList.iterator();
	        while(it.hasNext()) {
	        	List <Integer> l = (List<Integer>) it.next();
	        	System.out.println(l.size());
	        	if(l.size() ==0) {
	        		it.remove();
	        	}
	        }
	        	
			
	        
*/