import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int col = sc.nextInt();

		int [][] nums = new int[row][col];
		int i = 0;
		int j = 0;
		
		for(int z = 0; z < 2; z++) {
			for(i = 0; i < row; i++) {
				for(j = 0; j < col; j++) {
					nums[i][j] += sc.nextInt();
				}
			}
		}
		
		for(i = 0; i < row; i++) {
			for(j = 0; j < col; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}
