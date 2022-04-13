/* Author: Rehna Anthru
 * Sub: Employee Application using inheritance
 * Date: 3/3/2022
 */
/*
 * ) Consultant Class inherits from Employee 
1) Attributes: 
• Private int contractPeriodInMonths 
2) Methods: 
• One constructor to set employee’s and consultant's attributes 
• Public getter and setter for contractPeriodInMonths attribute 
• Override the getPay method to return object’s salary / contractPeriodInMonths 
/2
 */
public class Consultant extends Employee{
	//declaring the variable
	private int contractPeriodInMonths;
	
	//generating constructor for the Consultant class
	public Consultant(String name, double salary, String ssn, int contractPeriodInMonths) {
		super(name, salary, ssn);
		this.contractPeriodInMonths=contractPeriodInMonths;
		// TODO Auto-generated constructor stub
	}
	//generating getters and setters for contractPeriodInMonths attribute
	public int getContractPeriodInMonths() {
		return contractPeriodInMonths;
	}

	public void setContractPeriodInMonths(int contractPeriodInMonths) {
		this.contractPeriodInMonths = contractPeriodInMonths;
	}
	@Override
	public double getPay() {

		return this.salary/(contractPeriodInMonths/2);
	}


}
