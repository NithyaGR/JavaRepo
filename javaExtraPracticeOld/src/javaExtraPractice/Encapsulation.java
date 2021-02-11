package javaExtraPractice;

public class Encapsulation {
	
	private String name;
	private int id;
	//public String name1 = "Shakthi";
	//getter 
	public String getName(){
		return name;
	}
	
	//setter
	public void setName(String newName){
		this.name = newName;
	}
	
	public int getId(){
	
		return id;
	}
	//setter ID
	public void setId(int newId){
		this.id = newId;
		//System.out.println("printing From setID "+this.id);
	}

}
