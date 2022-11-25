

public class students {
	
	private String firstname, lastname;
	private String course;
	private int year;
	private char section;
	
	students(String firstname, String lastname, String course, int year, char section){
		this.firstname=firstname;
		this.lastname=lastname;
		this.course=course;
		this.year=year;
		this.section=section;
	}
	void introduce() {
		System.out.println("Full name :" + firstname + ", " + lastname);
		System.out.println("Course:" + course  + " Year: " + year + " Section: " + section);
		
	}
}
