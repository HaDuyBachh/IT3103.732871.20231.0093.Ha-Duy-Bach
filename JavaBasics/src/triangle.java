/*Ha Duy Bach 20210093*/

import java.util.Scanner;

public class triangle {
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = key.nextInt();
		key.close();
		
		for (int i =1; i<=n; i++)
		{
			for (int j = 1; j<=n-i; j++) System.out.print(" ");
			for (int j = 1; j<=2*i-1; j++) System.out.print("*");	
			
			System.out.print("\n");
		}
		
	}
}
