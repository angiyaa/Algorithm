import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char [] ch = s.toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			int num = (int)ch[i];
//			A to Z 65이상 90이하
//			A >> X (65 >> 88)
			if(num-3 >= 65) {
				System.out.print((char)(num-3));
			} else {
				System.out.print((char)(num+23));
			}
		}
	}
}