import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int assign [] = new int [28];
		
		for(int i = 0; i < assign.length; i++) {
			assign[i] = (sc.nextInt());
		}
		
		Arrays.sort(assign);

		for(int st : GetStNum(assign, 30)) {
			System.out.println(st);
		}
	}
	
	public static ArrayList<Integer> GetStNum(int[] arr, int total) {
		
		ArrayList<Integer> stNum = new ArrayList<Integer>();
		int idx = 1;
		 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != idx) {
				stNum.add(idx);
				i--;
				idx++;
			} else {
				idx++;
			}
		}
		while(idx <= total) {
			stNum.add(idx);
			idx++;
		}
		return stNum;
	}
}
