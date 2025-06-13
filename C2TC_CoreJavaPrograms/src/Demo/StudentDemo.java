package Demo;

public class StudentDemo {

	public static void main(String[] args) {
		Student st = new Student();
		st.setID(203);
		st.setAge(21);
		st.setName("Kamal");
		System.out.println(st);
		
		Student st2 = new Student();
		st2.setID(204);
		st2.setAge(23);
		st2.setName("Hamal");
		System.out.println(st2);
	}

}
