/* Author: Rehna Anthru
 * Sub: Employee Application using inheritance
 * Date: 3/3/2022
 */

/*
 * 5)Intern Class inherits from Employee 
1) Attributes: 
• Private int hoursPerWeek 
• Private String university 
• Private boolean isPaid 
2) Methods: 
• One constructor to set employee’s and intern’s attributes 
• Public getter and setter for university attribute 
• Override the getPay method to return object’s salary * hoursPerWeek * 2 if 
intern is paid, if not, return 0.0
 */
public class Intern extends Employee{
	//declaring variables and its types
	private int hoursPerWeek;
	private String university;
	private boolean isPaid;
	
	//constructor for Intern class
	public Intern(String name, double salary, String ssn, int hoursPerWeek, String university, boolean isPaid ) {
		super(name, salary, ssn);
		this.hoursPerWeek = hoursPerWeek;
		this.university = university;
		this.isPaid = isPaid;
		// TODO Auto-generated constructor stub
	}
	//generating getters and setters
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	@Override
	public double getPay() {
		
		if(this.isPaid) {
			return salary*hoursPerWeek*2;			
		}
		else {
			
		return 0.0;
		}
	}

}
