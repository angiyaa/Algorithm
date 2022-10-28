import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nums [] = new int [5];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = 0; j < nums.length-1; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					
					for(int n : nums) {
						System.out.print(n + " ");
					}
					System.out.println();
				}
			}
		}
	}
}
