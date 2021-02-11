package javaPrograms;

public class LoopStatements {
	
	public void printNumber(int number)
	{
		for (int no1=1; no1<=number; no1++)
		{	
		System.out.print(" "+number);
		}
	
	}

	public static void main(String[] args) {
		

		/*for(int x=1; x<=5; x++)
		{
			for (int y=1; y<=x; y++)
			{
				System.out.print(y+" ");
				
			}
			System.out.println();
		}*/
		
		    //Using Label for outer and for loop  
		   /* aa:  
		        for(int i=1;i<=3;i++){  
		            bb:  
		                for(int j=1;j<=3;j++){  
		                    if(i==2&&j==2){  
		                        break aa;  
		                    }  
		                    System.out.println(i+" "+j);  
		                }  
		        }  */
		
		for (int x=1; x<=4; x++)
		{
			for (int y=4; y>x; y--)
			{
				System.out.print(" ");
				//System.out.print(1);
				
			}
			LoopStatements object1 = new LoopStatements();
			object1.printNumber(x);
			System.out.println();
		}
		
		int[] intArray = {10, 20, 30,40};
		int no = 15;	
			for (int i: intArray){
				if(no==i){
					System.out.println("intArray has "+no);
				}
			}
			System.out.println("intArray doesn't have "+no);
		int num = 5;
		do{
			System.out.println(num);
			num++;
		}
		while (num<5);
		int product = 1;
		for (int i=1; i<=5; i++){
			product = product*i;
			
		}
		System.out.println("5 factorial is :"+product);	
		}  
	}




