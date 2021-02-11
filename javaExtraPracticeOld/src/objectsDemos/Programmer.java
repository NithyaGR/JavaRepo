package objectsDemos;

public class Programmer extends Writer {
	public static void write (){
		System.out.println("Writing Codes");
	}

	public void writes(){
		System.out.println("Writing Codes");
		
	}

	public static void main(String[] args) {
		
		Writer writer = new Programmer();
		writer.writes();
		//writer.write();
		write();
		

	}

}
