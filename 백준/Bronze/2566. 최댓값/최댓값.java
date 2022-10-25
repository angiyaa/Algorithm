import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int [][] nums = new int [9][9];
			
			for(int i = 0; i < nums.length; i++) {
				for(int j = 0; j < nums.length; j++) {
					nums[i][j] = sc.nextInt();
				}
			}
			
			int max = 0;
			int row = 0;
			int col = 0;
			
			for(int i = 0; i < nums.length; i++) {
				for(int j = 0; j < nums.length; j++) {
					max = Math.max(nums[i][j], max);
					
					if(nums[i][j] == max) {
						row = i+1;
						col = j+1;
					}
				}
			}
			
			System.out.println(max);
			System.out.println(row + " " + col);
	}
	
}
