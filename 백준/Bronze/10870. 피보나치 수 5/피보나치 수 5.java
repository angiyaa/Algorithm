import java.util.Scanner;

public class Main {
	
	static int goCheck(int n) {
		if(n == 0) return 0;
		else if(n == 1) return 1;
		
		return goCheck(n-1) + goCheck(n-2);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(goCheck(n));
    }
}