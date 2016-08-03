package session6.assignment4;

public class FirstYear extends Student {
	
	FirstYear(String name, int roll, long regNo, String grade, String currentYear) {
		super.name = name;
		super.regNo = regNo;
		super.roll = roll; 
		super.grade = grade;
		super.currentYear = currentYear;
	}

	public static void main(String[] args) {
		
		Student s = new FirstYear("Rocky", 100, 1002016, "A", "First");
		
		System.out.println("Name ="+s.name+"\nRoll no ="+s.roll+"\nRegistration no ="+s.regNo+"\nCurrent year ="+s.currentYear+"\nPassing Grade ="+s.grade);
		

	}

}
 