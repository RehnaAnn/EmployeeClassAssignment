/* Author: Rehna Anthru
 * Sub: Employee Application using inheritance
 * Date: 3/3/2022
 */
/*
 * 1) Attributes: 
• Private int hoursPerWeek 
2) Methods: 
• One constructor to set Employee attributes and hoursPerWeek 
• Override the getPay method to return object’s salary * hoursPerWeek * 2
(Pays every two weeks, salary is assumed to be hourly for part-time 
employees
 * 
 */
public class PartTime extends Employee{
	
	private int hoursPerWeek;	
	//generating constructor
	public PartTime(String name, double salary, String ssn, int hoursPerWeek) {
		
		super(name, salary, ssn);
		this.hoursPerWeek = hoursPerWeek;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getPay() {
		
		return this.salary*hoursPerWeek*2;
	}	

}
