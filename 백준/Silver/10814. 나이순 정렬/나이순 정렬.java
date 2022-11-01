import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	static class Member {
		int no; 
		int age;
		String name;

		public Member(int no, int age, String name) {
			this.no = no;
			this.age = age;
			this.name = name;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		ArrayList<Member> mem = new ArrayList<Member>();
		
		for(int i = 0; i < cnt; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			
			// mem 리스트에 Member 객체를 추가
			mem.add(new Member(i, age, name));
		}
		
		Collections.sort(mem, new Comparator<Member>() {
			public int compare(Member m1, Member m2) {
				if(m1.age == m2.age) {
					return Integer.compare(m1.no, m2.no);
				}
				return Integer.compare(m1.age, m2.age);
			}
		});
		
		for(Member list : mem) {
			System.out.println(list.age + " " + list.name);
		}
	}
}
