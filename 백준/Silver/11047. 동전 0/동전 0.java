import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int coins = Integer.parseInt(st.nextToken());
		int value = Integer.parseInt(st.nextToken());
		int [] pocket = new int[coins];
		int cnt = 0;
		
		for(int i = 0; i < coins; i++) {
			pocket[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		for(int i = pocket.length-1; i >= 0; i--) {
			if(pocket[i] <= value) {
				cnt += (value / pocket[i]);
				value = value % pocket[i];
			}
		}
		
		System.out.println(cnt);
	}
}