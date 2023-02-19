package Class_Person;

public class Entry {
	public static void main(String[] args) {
		Student s = new Student("Cuong", 23, "Ba Don", 4.0);
		s.display();
		System.out.println();
		Teacher t = new Teacher("Van", 45, "Dong Hoi", 999999999);
		t.display();
	}
}