import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String target = sc.next();
		String result = "";
		int cycle = 0;		
		
		if(target.length() < 2) { 
			target = "0" + target;
		}
        
		String t = target;
		while(result != target) {
			
			if(t.length() < 2) {  
				t = "0" + t;
			}
			
			int a = Character.getNumericValue(t.charAt(0));
			int b = Character.getNumericValue(t.charAt(1));
			int num = a+b;
			result = "" + b + num%10;
			cycle++;
			t = result; 

			if (result.equals(target)) { 
				System.out.println(cycle); 
				break;
			}
		}		
	}
}
