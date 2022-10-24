import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 홀수 총합 > 홀수 중 최소값
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 7; i++) {
			
			// 다받아 7개
			int num = sc.nextInt();
			
			// 홀수일때만 배열
			if(num%2 == 1) {
				list.add(num);
				sum += num;
			}
		}
		
		// 정렬
		
		
		Collections.sort(list);
		if(sum == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(list.get(0));
		}
	}

}
