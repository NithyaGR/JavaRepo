package ExceptionPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
		try{
			methodA();
		} catch(FileNotFoundException fe){
			System.out.println("File Not Found Exception: "+ fe.getMessage());
		}
	}
	
	public static void  methodA() throws IOException, FileNotFoundException{
		System.out.println("In method A");
		methodB();
		
	}
	public static void methodB() throws IOException, FileNotFoundException{
		System.out.println("In method B");
		File file = new File("name.txt");
		FileInputStream fis = new FileInputStream(file);
		fis.close();
		
	}

}
