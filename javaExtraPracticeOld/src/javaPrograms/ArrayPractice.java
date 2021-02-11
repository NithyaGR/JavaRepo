package javaPrograms;

public class ArrayPractice {
	
	public static boolean contains(int[] arr, int item) {
	      for (int n : arr) {
	         if (item == n) {
	        	 System.out.println("array has "+item);
	            return true;
	         }
	      }
	      System.out.println("array doesn't have "+item);
	      return false;
	}

	/*public static void containValue(int[][] arr, int item1){
		  System.out.println(arr.length);
			for(int i = 0;i<arr.length; i++){
				for(int n: arr[i]){
					if (n==item1){
						System.out.println("array has "+item1);
						break;
					}
			}
				System.out.println("array doesn't have "+item1);
			}
			
	}*/
	public static boolean containValue(int[][] arr, int item1){
		
		for(int i = 0;i<arr.length; i++){
				for(int n: arr[i]){
					if (n==item1){
						System.out.println("array"+"["+i+"]"+" has "+item1);
						return true;
						
					}
									
			}
			
		}
		System.out.println("array has no "+item1);
		return false;
				
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*int array1[];
       array1 = new int[3];
       array1[0] = 1;
       array1[1] = 20;
       array1[2]= 300;
       
       System.out.println(array1.length);
       System.out.println(array1[1]);
       
       String [] array2 = new String[2];
       array2[0]= "Selenium";
       array2[1]= "Training";
       System.out.println(array2[0]+" "+array2[1]);
       
       int arr[]={1,2,3,46,57,68};
       System.out.println(arr.length);*/
       String arr1[][]={
    		             {"Name", "Age", "Qualification"},
    		             {"Nithya","41","PG"}
    		           };
       /*System.out.println(arr1[0][0]);
       System.out.println(arr1[0][1]);
       System.out.println(arr1[0][2]);
       System.out.println(arr1[1][0]);
       System.out.println(arr1[1][1]);
       System.out.println(arr1[1][2]);*/
       
       //System.out.println(arr1.length);
       //try{
       System.out.println("****************************************");
       int ar[][] = new int [3][];
       ar[0] = new int[]{0};
       ar[1] = new int[]{1,2,3};
       ar[2] = new int[]{4,5};
       System.out.println(ar[1][1]);
       for (int[] values : ar) {
    	  for (int i : values) {
    		  System.out.println(i);
			
		}
		
	}
       for(int i = 0; i<ar.length; i++){
    	   for (int j=0; j<ar[i].length; j++){
    		   System.out.println(ar[i][j]);
    	   }
       }
       System.out.println("***************************************");
       
    	   
       
       for (int i=0; i<arr1.length; i++)
       {
    	   for (int j=0; j<arr1[i].length; j++)
    	   {
    		   System.out.println(arr1[i][j]);
    		  
    	   }
       }
      // }
       /*catch (ArrayIndexOutOfBoundsException e)
       {
    	   System.out.println("Exception");
       }
       */
      int[] my_array1 = {
               1789, 2035, 1899, 1456, 2013, 
               1458, 2458, 1254, 1472, 2365, 
               1456, 2265, 1457, 2456};
         System.out.println(contains(my_array1, 2013));
         System.out.println(contains(my_array1, 2015));
       
         System.out.println(my_array1 instanceof Object);
         System.out.println("###################");
         int[][] a = {
                 {1, -2, 3}, 
                 {-4, -5, 6, 9}, 
                 {7}, 
           };
          /*System.out.println(a.length); 
          System.out.println(a[0].length);
          System.out.println(a[1].length);
          System.out.println(a[2].length);
          for (int i = 0; i < a.length; ++i) {
             for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
             }
          }*/
         System.out.println(containValue(a,8));
         for (int[] values : a) {
			System.out.println(values);
			
		}
         for (int values : my_array1) {
        	 System.out.println(values);
		}        
         String myArray[][] = {{"Nithya","41","F"},{"Kumar","47","M"}};
         System.out.println(myArray.length);
         for (int i = 0; i<myArray.length; i++)
         {
        	 for (String value : myArray[i]) 
        	 {
        		 System.out.println(value);
        	 }
         }
        
         
	
	}

}
/**/   