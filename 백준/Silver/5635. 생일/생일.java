import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	static class Student {
		String name;
		int dd;
		int mm;
		int yyyy;
		
		public Student(String name, int dd, int mm, int yyyy) {
			this.name = name;
			this.dd = dd;
			this.mm = mm;
			this.yyyy = yyyy;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int st = sc.nextInt();
		
		ArrayList<Student> age = new ArrayList<Student>();
		  
		for(int i = 0; i < st; i++) {
			String name = sc.next();
			int dd = sc.nextInt();
			int mm = sc.nextInt();
			int yyyy = sc.nextInt();
			
			age.add(new Student(name, dd, mm, yyyy));
		}
		
		Collections.sort(age, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
			
				if(s1.yyyy == s2.yyyy) {
					if(s1.mm == s2.mm) {
						return -Integer.compare(s1.dd, s2.dd);
					}
					return -Integer.compare(s1.mm, s2.mm);
				}
				return -Integer.compare(s1.yyyy, s2.yyyy);
			}
		});
		
		System.out.println(age.get(0).name);
		System.out.println(age.get(st-1).name);
	}
}
