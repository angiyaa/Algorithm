import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		for(int i = 0; i < T; i++) {
			int idx = sc.nextInt() - 1;
			String str = sc.next();
			String [] word = str.split("");
			chkSpell(word, idx);
		}
	}
	
	public static void chkSpell(String[] arr, int a) {
		String str = "";
		arr[a] = "";
		
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		System.out.println(str);
	}
}