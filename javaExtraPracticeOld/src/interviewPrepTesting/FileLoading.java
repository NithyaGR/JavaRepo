package interviewPrepTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class FileLoading {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();

		String filePath = System.getProperty("user.dir")+"/src/interviewPrepTesting/config.properties";
		//System.out.println(filePath);
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		System.out.println(prop.get("location"));
		System.out.println(prop.getProperty("testing"));
		System.out.println(prop.get("Nithya"));
		System.out.println(prop.getProperty("Kumar"));
		System.out.println(prop.setProperty("myName", "Nithya"));
		
		
		filePath = System.getProperty("user.dir")+"/src/interviewPrepTesting/newFile.text";
		file = new File(filePath);
		try {
			if(file.createNewFile()) {
				System.out.println("File cerated");
			}
			else {
				System.out.println("File already exists");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		  FileWriter writer = new FileWriter(file);
		  String myFirstText = "Hi! my first texts - I'm Nithya, I'm a software Engineer ";
		  writer.write(myFirstText); writer.close();
		 

		Scanner reader = new Scanner(file);
		while(reader.hasNextLine()) {
			String fileData = reader.nextLine();
			System.out.println(fileData);
		}
		reader.close();
	}

}
