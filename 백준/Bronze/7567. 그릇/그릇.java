import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String plate = sc.next();
		
		String [] pl = plate.split("");
		int height = 0;
		
		if(pl.length != 0) {
			height = 10;
		}
		
		for(int i = 1; i < pl.length; i++) {
			if(pl[i].equals(pl[i-1])) {
				height += 5;
			} else {
				height += 10;
			}
		}
		System.out.println(height);
    }
}
