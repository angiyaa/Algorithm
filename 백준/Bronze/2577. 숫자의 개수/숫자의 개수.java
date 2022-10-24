import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int total = a * b * c;
		int cnt [] = new int [10];
		
		for(int i = 0; i < Integer.toString(total).length(); i++) {
			String str = Integer.toString(total).substring(i, i+1);
			
			for(int j = 0; j < cnt.length; j++) {
				
				if(j == Integer.parseInt(str)) {
					cnt[j]++;
				}
			}
		}
		
		for(int num : cnt) {
			System.out.println(num);
		}
	}
}
