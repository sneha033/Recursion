package apnaCollege;

public class Static1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
	System.out.println(s1.schoolName);
	Student s2 = new Student();
	System.out.println(s2.schoolName);
	s2.schoolName= "abc";
	System.out.println(s2.schoolName);

		
	}
}
  class Student {
	static String schoolName ="mona";
	
	void eat() {
		System.out.println("choco");
	}
}