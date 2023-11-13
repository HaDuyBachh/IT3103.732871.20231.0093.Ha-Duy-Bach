package hust.soict.dsai.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConcatenationInLoops {
	public static void main(String[] args) {
		
		String filename = "filename.txt";
		byte[] inputBytes = {0};
		
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//không sử dụng Stringbuilder
		long start = System.currentTimeMillis();
		String s = "";
		for (byte b : inputBytes)
		{
			s += b;
		}
		System.out.println("ghép xâu không Stringbuilder " + (System.currentTimeMillis() - start));
		
		//có sử dụng Stringbuilder
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (byte b : inputBytes)
		{
			sb.append(b);
		}
		
		s = sb.toString();
		
		System.out.println("ghép xâu có Stringbuilder " + (System.currentTimeMillis() - start));
	}
}
