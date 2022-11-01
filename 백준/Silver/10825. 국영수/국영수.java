import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	static class Student {
		String name;
		int kor;
		int eng;
		int mth;
		
		public Student(String name, int kor, int eng, int mth) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mth = mth;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int st = sc.nextInt();
		
		ArrayList<Student> score = new ArrayList<Student>();
		
		for(int i = 0; i < st; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mth = sc.nextInt();
			
			score.add(new Student(name, kor, eng, mth));
		}
		
		Collections.sort(score, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				if(s1.kor == s2.kor && s1.eng == s2.eng && s1.mth == s2.mth) {
					return s1.name.compareTo(s2.name);
				} else if(s1.kor == s2.kor && s1.eng == s2.eng) {
					return -Integer.compare(s1.mth, s2.mth);
				} else if (s1.kor == s2.kor) {
					return Integer.compare(s1.eng, s2.eng);
				} else {
					return -Integer.compare(s1.kor, s2.kor);
				}
			}
		});
		
		for(Student student : score) {
			System.out.println(student.name);
		}
	}
}