import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int [] price = new int [100];
		
		for(int i = 0; i < 3; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();

			for(int j = start; j < end; j++) {
				price[j]++;
			}
		}
		
		int total = 0;
		for(int i = 0; i < price.length; i++) {
			if(price[i] == 1) {
				total += a;
			} else if(price[i] == 2) {
				total += b*2;
			} else if(price[i] == 3) {
				total += c*3;
			}
		}
		System.out.println(total);
    }
}
