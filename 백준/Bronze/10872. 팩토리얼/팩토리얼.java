import java.util.Scanner;

public class Main {
	
	static int getResult(int n) {
		
		if(n <= 1) return 1;
		
		return n * getResult(n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(getResult(N));
	}
}