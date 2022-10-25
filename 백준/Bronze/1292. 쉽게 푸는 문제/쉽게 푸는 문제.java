import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		int dup = 0;
		
		for(int i = 1; i < 1001; i++) {
			nums.add(i);
			dup++;
			for(int j = 1; j < dup; j++) {
				nums.add(i);
			}
		}
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		System.out.println(GetSum(nums, start, end));
	}
	
	public static int GetSum(ArrayList<Integer> list, int start, int end) {
		int sum = 0;
		for(int i = start-1; i <= end-1; i++) {
			sum += list.get(i); 
		}
		return sum;
	}
}
