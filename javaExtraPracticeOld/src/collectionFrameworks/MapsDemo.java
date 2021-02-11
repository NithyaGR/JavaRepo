package collectionFrameworks;

import java.util.HashMap;

public class MapsDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(123,"Nithya");
		hMap.put(245,"Kumar");
		hMap.put(null, "null");
		hMap.put(567, "Krishna");//if (123,"Krishna is added -size is just 3, it leaves (123, "Nithya").
		System.out.println("Map Elements ::" + hMap);
		//System.out.println("Value is     ::" + hMap.get(null));
		System.out.println("Value is     ::" + hMap.get(245));
		System.out.println("Keys are     ::"+ hMap.keySet());
		System.out.println("Values are   ::"+ hMap.values());
		System.out.println("Size of hMap is "+hMap.size());
		
		
	}

}
