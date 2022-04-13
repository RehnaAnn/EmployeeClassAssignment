import java.util.Scanner;

/* Author: Rehna Anthru
 * Sub: Employee Application using inheritance
 * Date: 3/3/2022
 */
/*
 *  Payroll class has the main method 
1) A static class variable called employees which is an array of 6 Employees 
2) Create a static method called printMenu that returns the following String:
“Employee types\n\t1. Full-time” + 
 "\n\t2. Part-time\n\t3. Intern\n"+ 
 "\n\t4. Consultant"+ 
 “\n\t0. Exit system”; 
3) Main method: 
• Declare a local variable called count and assign it to 0 
• Another int userChoice 
• Run a do while loop that runs as long as userChoice is not 0 and count is not 
equal to 6 
• Print menu by calling printMenu 
• Get all general employee details 
• If the user has selected options 1…4, ask for appropriate class’s attributes 
• Create an object using appropriate constructor and assign it into employees 
array’s count index, increment count using post-increment operator 
• Once the do while loop has ended, print a message saying “payroll for each 
employee in employees array is:”
• Run a for loop to loop through the array 
• Print employee’s Id : employee’s getPay() return value
 */

public class Payroll {

	static Employee[] employees=new Employee[6];

	public static void main(String[] args) {
		//declaring variables
		int count=0;
		int userChoice;
		String name;
		double salary;
		String ssn;		
		int hoursPerWeek;		
		boolean isPaid;

		Scanner input=new Scanner(System.in);
		
		//Running a do while loop that runs as long as userChoice is not 0 and count is not 
		//equal to 6
		do {
			//calling function to print the menu
			System.out.println(printMenu());
			userChoice=input.nextInt();

			System.out.println("Enter employee's name");
			name = input.next();

			System.out.println("Enter employee's salary");
			salary = input.nextDouble();

			System.out.println("Enter employee's ssn");
			ssn = input.next();
			
			//user selecting the options
			if(userChoice == 1)
			{
				employees[count] = new FullTime(name, salary, ssn);
			}
			else if(userChoice == 2)
			{
				System.out.println("Enter part time employee's hoursPerWeek");
				hoursPerWeek = input.nextInt();

				employees[count] = new PartTime(name, salary, ssn, hoursPerWeek);
			}
			else if(userChoice == 3)
			{
				System.out.println("Enter part time employee's hoursPerWeek");
				hoursPerWeek = input.nextInt();

				System.out.println("Enter part time employee's University");
				String university = input.next();

				System.out.println("Enter if employee is paid: Y/N");
				String paidYN = input.next();
				isPaid=paidYN.equalsIgnoreCase("Y");				
				employees[count] = new Intern(name, salary, ssn, hoursPerWeek, university, isPaid);
			}
			else if(userChoice == 4)
			{
				System.out.println("Enter employee's contract period in months");
				int contractPeriodInMonths = input.nextInt();
				employees[count] = new Consultant(name, salary, ssn, contractPeriodInMonths);
			}
			count++;

		}while(userChoice != 0 && count != 6);

		System.out.println("payroll for each employee in employees array is: ");
		for(int i=0; i<= employees.length-1; i++)
		{
			System.out.println("Employee name: " + " Employee pay: " + employees[i].getPay());
		}
		input.close();
		
	}
	//method for printing menu
	public static String printMenu() {
		return "Employee types\n\t1. Full-time" +
				"\n\t2. Part-time\n\t3. Intern\n"+
				"\n\t4. Consultant"+
				"\n\t0. Exit system";		
	}

}


