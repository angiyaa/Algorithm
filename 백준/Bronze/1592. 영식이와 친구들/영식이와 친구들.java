import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		int cnt = 0; 
		int [] players = new int [N+1];
		players[1] = 1;
		
		int idx = 1;
		while(true) {
			if(players[idx] == M) {
				break;
			}
			
			if(players[idx]%2 == 1) {
				idx += L;
			} else {
				idx -= L;
			}
			
			if(idx > N) {
				idx %= N;
			} else if(idx < 1){
				idx += N;
			}
			players[idx]++;
			cnt++;
		}
		System.out.println(cnt);
	}
}