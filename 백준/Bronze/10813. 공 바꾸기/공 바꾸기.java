import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [] basket = new int [N];
		for(int i = 0; i < basket.length; i++) {
			basket[i] = i+1;
		}
		
		int temp = 0;
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			temp = basket[a]; 
			basket[a] = basket[b];
			basket[b] = temp;
		}
		
		for(int num : basket) {
			System.out.print(num + " ");
		}
	}
}