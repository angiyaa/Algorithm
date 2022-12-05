import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int [] nums = new int [5];
	
	static int getAVG(int [] n) {
		int sum = 0;
		for(int num : n) {
			sum += num;
		}
		
		return sum / n.length;
	}
	
	static int getMID(int [] n) {
		
		Arrays.sort(n);
		return n[2];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println(getAVG(nums));
		System.out.println(getMID(nums));
	}
}