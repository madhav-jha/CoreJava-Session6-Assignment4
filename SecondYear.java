package session6.assignment4;

public class SecondYear extends Student {

	SecondYear(String name, int roll, long regNo, String grade, String currentYear) {
		super.name = name;
		super.regNo = regNo;
		super.roll = roll; 
		super.grade = grade;
		super.currentYear = currentYear;
	}

	public static void main(String[] args) {
		
		Student s = new SecondYear("Vicky", 125, 1252015, "A+", "Second");
		
		System.out.println("Name ="+s.name+"\nRoll no ="+s.roll+"\nRegistration no ="+s.regNo+"\nCurrent year ="+s.currentYear+"\nPassing Grade ="+s.grade);
		

	}

}
