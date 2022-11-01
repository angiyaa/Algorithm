import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	static class XY {
		int x; 
		int y;

		public XY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		ArrayList<XY> xy = new ArrayList<XY>();
		
		for(int i = 0; i < cnt; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			xy.add(new XY(x, y));
		}
		
		Collections.sort(xy, new Comparator<XY>() {
			
			public int compare (XY nums1, XY nums2) {
				
				if(nums1.x == nums2.x) {
					return Integer.compare(nums1.y, nums2.y);
				}
				return Integer.compare(nums1.x, nums2.x);
			}
		});
		
		for(XY nums : xy) {
			System.out.println(nums.x + " " + nums.y);
		}
	}
}
