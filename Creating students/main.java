
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("how many students do you want?");
		int size = s.nextInt();
		s.nextLine();
		
		students students[] = new students[size];
		
		for(int i=0; i<students.length; i++) {
			String firstname, lastname, course;
			int year;
			char section;
			System.out.println("Student # "+(i+1));
			System.out.println();
			
			System.out.print("name 	:");
			firstname=s.nextLine();
			System.out.print("lastname : ");
			lastname=s.nextLine();
			System.out.print("Enter Course  : ");
			course= s.nextLine(); 
			System.out.print("Enter year    : ");
			year=s.nextInt();
			s.nextLine();
			System.out.print("Enter Section :");
			section = s.nextLine().charAt(0);
			System.out.println();
			
			
			students[i] = new students(firstname,lastname,course,year, section);
			
		}
		for(students st : students) {
			st.introduce();
			System.out.println();
		}
		
		
		 
		
	}

}
