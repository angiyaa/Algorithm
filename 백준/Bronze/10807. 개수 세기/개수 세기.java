import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for(int i = 0; i < num; i++) {
			nums.add(sc.nextInt());
		}
		int target = sc.nextInt();
	
		System.out.println(ChkTarget(nums, target));;
	}
	
	public static int ChkTarget(ArrayList<Integer> list, int a) {
		int cnt = 0;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == a) {
				cnt++;
			}
		}
		return cnt;
	}
}
