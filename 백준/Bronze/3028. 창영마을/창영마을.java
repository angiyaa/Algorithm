import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] cups = {1, 0, 0};
		
		String s = sc.next();
		String [] order = s.split("");
		for(int i = 0; i < order.length; i++) {
			switch(order[i]) {
			case "A" : Swap(cups, 0, 1);
				break;
			case "B" : Swap(cups, 1, 2);
				break;
			case "C" : Swap(cups, 0, 2);
				break;
			}
		}
		
		for(int i = 0; i < cups.length; i++) {
			if(cups[i] == 1) {
				System.out.println(i+1);
			}
		}
	}
	
	public static void Swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}