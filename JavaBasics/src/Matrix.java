/*Ha Duy Bach 20210093*/

public class Matrix {
	public static void main(String[] args) {
		int[][] matrix1 = {
				{2,4,8},
				{10,12,14},
				{16,18,20}
		};
		int[][] matrix2 = {
				{2,4,8},
				{10,12,14},
				{16,18,20}
		};
		
		if (Check(matrix1, matrix2))
		{
			System.out.print("Kết quả cộng 2 ma trận: \n");
			for(int[]row : MatrixAdd(matrix1,matrix2))
			{
				for (int col : row)
				{
					System.out.print(col + " ");
				}
				System.out.print("\n");
			};
		}
		else
			System.out.print("Không thể cộng hai ma trận không cùng kích thước");
		
		System.exit(0);
	}
	
	private static boolean Check(int[][] mx1, int[][] mx2)
	{
		return mx1.length == mx2.length && mx1[0].length == mx2[0].length;
	}
	
	private static int[][] MatrixAdd(int[][] mx1, int[][]mx2)
	{
		int row = mx1.length;
		int col = mx1[0].length;
		int[][]  res = new int[row][col];
		
		for (int i = 0; i<row; i++)
			for (int j = 0; j<col; j++)
			{
				res[i][j] = mx1[i][j] + mx2[i][j];
			}
		
		return res;
	}
	
	
}
