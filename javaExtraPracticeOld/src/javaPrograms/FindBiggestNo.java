package javaPrograms;

public class FindBiggestNo {

	int bigNo;
	public int getBiggerNo(int no1, int no2){
		if(no1>=no2){
			return no1;
		}
		else 
			return no2;
	}
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = -205;
		int n3 = -96;
		int n4 = -199;
		int n5 = 10;
	    FindBiggestNo ob = new FindBiggestNo();
	
		//System.out.println(ob.getBiggerNo(n1, n2));
		//System.out.println(ob.getBiggerNo(ob.getBiggerNo(n1, n2), n3));
		//System.out.println(ob.getBiggerNo(n4, ob.getBiggerNo(ob.getBiggerNo(n1, n2), n3)));
		System.out.println(ob.getBiggerNo(n5, ob.getBiggerNo(n4, ob.getBiggerNo(ob.getBiggerNo(n1, n2), n3))));

		
	}

}
