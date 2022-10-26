import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] white = new int [100][100];
		int black = sc.nextInt();
		
		for(int i = 0; i < black; i++) {
			int left = sc.nextInt();
			int bott = sc.nextInt();
			SetBlack(white, bott, left);
		}
		
		int cnt = 0; 
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(white[i][j] == -1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}	
	
	public static int[][] SetBlack(int[][]arr, int a, int b) {
		for(int i = a; i < a + 10; i++) {
			for(int j = b; j < b + 10; j++) {
				arr[i][j] = -1;
			}
		}
		return arr;
	}
}
