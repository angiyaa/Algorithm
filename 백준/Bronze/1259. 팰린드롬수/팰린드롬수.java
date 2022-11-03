import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String str = "";
		boolean flag = true;
		
		while (flag) {
			str = sc.next();
			if(str.equals("0")) {
				flag = false;
			} else {
				for(int i = 0; i < str.length(); i++) {
					if(str.charAt(i) == str.charAt(str.length()-1-i)) {
						cnt++;
					} else {
						System.out.println("no");
						cnt = 0;
						break;
					}
				}

				if(cnt >= str.length()/2) {
					System.out.println("yes");
				}
			}
		}
	}
}