/* Ha Duy Bách*/
import java.util.Scanner;
public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Tên của bạn là gì?\n");
		String name = keyboard.nextLine();
		
		System.out.print("Bạn bao nhiêu tuổi?\n");
		String old = keyboard.nextLine();
		
		System.out.print("Bạn cao bao nhiêu?\n");
		String tall = keyboard.nextLine();
		
		keyboard.close();
		
		System.out.print("Mrs/Mr. " + name + ", " + old + "tuổi, có chiều cao là: " + tall);
	}
}
