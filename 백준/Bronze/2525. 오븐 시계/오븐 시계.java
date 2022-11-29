import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		for (int i = 16; i > 0; i--) {
			if (C >= 60 * i) {
				A += i;
				B += C - 60 * i;
				break;
			} else if (C < 60) {
				B += C;
				break;
			} else
				continue;
		}

		if (B > 59) {
			A++;
			B -= 60;
		}

		if (A >= 24) {
			A -= 24;
		}
		System.out.println(A + " " + B);
	}
}
