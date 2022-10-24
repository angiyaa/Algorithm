import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(ChkQuadrant(num1, num2));
	}
	
	public static int ChkQuadrant(int a, int b) {
		int result = 0;
		
		if(a > 0 && b > 0) {
			result = 1;
		} else if(a < 0 && b > 0) {
			result = 2;
		} else if(a < 0 && b < 0) {
			result = 3;
		} else {
			result = 4;
		}
		return result;
	}
}
