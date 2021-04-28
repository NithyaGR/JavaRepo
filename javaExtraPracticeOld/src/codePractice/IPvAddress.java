package codePractice;

public class IPvAddress {
	static boolean isIPv4Address(String inputString) {
	    boolean result = false; int count = 0;
	    System.out.println(inputString);
	    String [] val= inputString.split("\\.");
	    System.out.println(val.length);
	    System.out.println(val[0]);
	    for (int i=0; i<val.length; i++) {
			//System.out.print(val[i]);
			System.out.println(Integer.parseInt(val[i]));
			//System.out.println(val[i]>0);
			
		}
	    if(val.length == 4){
	        for(int i=0; i<val.length; i++){
		        if((Integer.parseInt(val[i])>=1) && (Integer.parseInt(val[i])<=255)){
		            System.out.println("True");
		        }
		        else {
		        	count++;
		        	break;
		        }
	        }
	    }
	    System.out.println(count);
	    if(count>0) 
	    	result = false;
	    else
	    	result = true;
	    
	    
	    return result;

	}
	public static void main(String[] args) {
		System.out.println(isIPv4Address(".254.255.0"));

	}

}
