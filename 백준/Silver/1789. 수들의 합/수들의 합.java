import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long target = sc.nextLong();
		long num = 0;
		int cnt = 0;
		
		for(int i = 1; i <= target; i++) {
			num += i;
			
			if(num > target) {
				cnt = i-1;
				break;
			} else if(num == target) {
				cnt = i;
				break;
			}
		}
		System.out.println(cnt);
	}
}
