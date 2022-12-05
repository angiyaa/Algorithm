import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n,m;
	static int [] cards;
	
	static boolean isMatch(int num) {
		
		int left = 0;
		int right = cards.length-1;
		
		while(left <= right){
            int midIdx = (left + right) / 2;
            int mid = cards[midIdx];

            if(num < mid) right = midIdx - 1;
            else if(num > mid) left = midIdx + 1;
            else return true;
        }
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		cards = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(cards);
		
		m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(isMatch(num)) bw.write("1 ");
			else bw.write("0 ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}