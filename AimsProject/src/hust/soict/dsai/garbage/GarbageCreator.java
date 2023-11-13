package hust.soict.dsai.garbage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.io.FileWriter;

public class GarbageCreator {
	public static void main(String[] args) {
		String s = "";
		for (int i = 0; i<=3000000; i++)
		{
			s+= "a";
		}
		
		try {
		      File file = new File("filename.txt");
		      if (file.createNewFile()) {
		        System.out.println("File created: " + file.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		try {
		      FileWriter myWriter = new FileWriter("filename.txt");
		      myWriter.write(s);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}
}
