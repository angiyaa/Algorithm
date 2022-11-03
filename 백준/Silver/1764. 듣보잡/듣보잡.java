import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		HashSet<String> hs = new HashSet<String>();
		
		for(int i = 0; i < N; i++) {
			hs.add(sc.next());
		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(M --> 0) { //4 - > 3  2 1  0
			String str = sc.next();
			if(hs.contains(str)) { 
				list.add(str);
			}
		}

		Collections.sort(list);
		System.out.println(list.size());
		for(String name : list) {
			System.out.println(name);
		}
	}
}