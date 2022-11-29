import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 0;
		
		if(N < 1) {
			result = 1;
		} else {
			result = N;
		}
		
		while(N-- > 1) {
			result *= N;
		}
		System.out.println(result);
	}
}