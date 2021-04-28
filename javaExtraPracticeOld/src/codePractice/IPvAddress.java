package codePractice;

public class IPvAddress {
	static boolean isIPv4Address(String inputString) {
	    boolean result = false; int count = 0;
	    String[] val = inputString.split("\\.");
	    if(val.length != 4 || inputString.charAt(0) == '.'){
	        return false;
	    }
	    for(int i=0; i<val.length; i++){
	      if(val[i].equals("00") || val[i].equals("01")){
	          return false;
	      }
	      try{
	      if((Integer.parseInt(val[i])<0) || (Integer.parseInt(val[i])>255)){
			            count++;
			        	break;
			        }
	      } catch(NumberFormatException e)    {
	          count++;
	          break;
	      }      
	 }
	    
	    if(count > 0)
	        result = false;
	    else
	        result = true;    
	      
	    return result;

	}
	public static void main(String[] args) {
		System.out.println(isIPv4Address("64.233.161.00"));

	}

}
