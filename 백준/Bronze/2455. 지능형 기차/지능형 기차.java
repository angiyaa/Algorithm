import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] train = new int [4][2];
		int pass = 0;
		int max = 0;

		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 2; j++) {
				train[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < 4; i++) {
			int j = 0;
			pass = pass - train[i][j] + train[i][j+1];
			max = Math.max(max, pass);
		}
		System.out.println(max);
	}
}