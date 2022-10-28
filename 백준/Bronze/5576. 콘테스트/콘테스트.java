import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] w = new int[10];
		int [] k = new int[10];
		
		for(int i = 0; i < 10; i++) {
			w[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			k[i] = sc.nextInt();
		}
		
		Arrays.sort(w);
		Arrays.sort(k);
		
		int sumW = 0;
		int sumK = 0;
		for(int i = w.length-1; i > w.length-4; i--) {
			sumW += w[i];
		}
		for(int i = k.length-1; i > k.length-4; i--) {
			sumK += k[i];
		}
		System.out.println(sumW + " " + sumK);
    }
}
