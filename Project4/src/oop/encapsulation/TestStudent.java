package oop.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student Aziz = new Student();
		Aziz.setStName("Aziz");
		Aziz.setStID(261);
		Aziz.setStDOB("09/14/94");
		System.out.println(Aziz.getStName()+ " " +Aziz.getStID()+" "+Aziz.getStDOB());
		
		Student Ali = new Student();
		Ali.setStName("Ali");
		Ali.setStID(262);
		Ali.setStDOB("09/14/94");
		System.out.println(Ali.getStName()+ " " +Ali.getStID()+" "+Ali.getStDOB());

		// when building constructor you can do the following shortcut instead of typing the above	
		Student St3 = new Student("Aziz", 914, "03/05/1995");
		System.out.println(St3.getStName()+ " " +St3.getStID()+" "+St3.getStDOB());
	}
		// same result with less typing and memory usage
}
