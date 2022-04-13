/* Author: Rehna Anthru
 * Sub: Employee Application using inheritance
 * Date: 3/3/2022
 */

/*
FullTime Class inherits from Employee 
1) FullTime will not have any specific attributes of its own. It inherits the attributes 
from Employee 
2) Methods: 
• One constructor to set Employee attributes 
• It’ll have a method called calculateBonus which would return 15% of the 
object's salary. Will this method be static or non-static? 
• Override the getPay method to return object’s salary divided by 26 
(Pays every two weeks, which comes out to 26 times a year for most years)
*/

public class FullTime extends Employee {

	public FullTime(String name, double salary, String ssn) {
		//inherits from the base class
		super(name, salary, ssn);
		// TODO Auto-generated constructor stub
	}
	//calculating the bonus for a full time employee
	public double calculateBonus() {
		return salary * 15/100;
	}
	@Override
	public double getPay() {
		
		return salary/26;
	}

}
