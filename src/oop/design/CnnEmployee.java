package oop.design;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * 
	 **/
	public static void main(String[] args) {

		EmployeeInfo empinfo = new EmployeeInfo();
		EmployeeInfo emp1 = new EmployeeInfo("Abc def", 1234);
		EmployeeInfo emp2 = new EmployeeInfo("Afan fsna", 1235);
		EmployeeInfo emp3 = new EmployeeInfo("Banasfn fafa", 1236);
		Employee emp4 = new EmployeeInfo("MD abcdw");
		EmployeeAbs emp5 = new EmployeeInfo();
		EmployeeInfo emp6 = new EmployeeInfo(1);


		// static variable implemented
		EmployeeInfo.companyName = "CNN Centre";
		System.out.println("Company Name: " + EmployeeInfo.companyName);
		EmployeeInfo.address = "New York, ny 11234 USA";
		System.out.println("Company Address: " + EmployeeInfo.address);
		System.out.println("----------------------------------------------------");

		System.out.println("\nName: " + emp4.employeeName());
		((EmployeeInfo) emp4).setDesignation("Atometion taster");
		System.out.println("Designation: "
				+ ((EmployeeInfo) emp4).getDesignation());
		System.out.println("Salary: $" + emp4.calculateSalary(1) + " Million");

		System.out.println("\nEmployee ID: " + emp1.employeeId());
		System.out.println("Name: " + emp1.employeeName());
		emp1.assignDepartment("IT");
		emp1.setDesignation("Director");
		System.out.println("Designation: " + emp1.getDesignation());

		emp1.partTime();
		System.out.println("Salary: " + emp1.calculateSalary(90000) + "k");
		emp1.benefitLayout("Medical, SickPay");
		System.out.println("Yearly Bonus: "
				+ EmployeeInfo.calculateEmployeBonus(90000, 0.2)
				+ "-------Best Performance");
		System.out.println("Employee Pension: "
				+ EmployeeInfo.calculateEmployePension(90000, 1)
				+ "-------1 Year employment");

		System.out.println("\n\nEmployee ID: " + emp2.employeeId());
		System.out.println("Name: " + emp2.employeeName());
		emp2.assignDepartment("Central News Room");
		emp2.setDesignation("Doctor");
		System.out.println("Designation: " + emp2.getDesignation());

		emp2.fullTime();
		System.out.println("Salary: " + emp2.calculateSalary(120000) + "k");
		emp2.benefitLayout("Medical, 401k, SickPay, HolydayPay, VacationPay, LifeInsurance");
		System.out.println("Yearly Bonus: "
				+ EmployeeInfo.calculateEmployeBonus(120000, 0.1)
				+ "-------Best Performance");
		System.out.println("Employee Pension: "
				+ EmployeeInfo.calculateEmployePension(120000, 3)
				+ "-------3 Years employment");

		System.out.println("\n\nEmployee ID: " + emp3.employeeId());
		System.out.println("Name: " + emp3.employeeName());
		emp3.assignDepartment("Project Maneger");
		emp3.setDesignation("Software Test Engineer");
		System.out.println("Designation: " + emp3.getDesignation());
		emp3.fullTime();
		System.out.println("Salary: " + emp3.calculateSalary(105000) + "k");

		emp3.benefitLayout("Medical, SickPay, HolydayPay, VacationPay");
		System.out.println("Yearly Bonus: "
				+ EmployeeInfo.calculateEmployeBonus(105000, 0.1)
				+ "-------Best Performance");
		System.out.println("Employee Pension: "
				+ EmployeeInfo.calculateEmployePension(105000, 2)
				+ "-------2 Years employment");

		System.out.println("\nClassified Employee");
		emp5.email("abc@abc.com");
		emp5.contactNo(1010101010L);
		emp5.fullTime();

		System.out.println("\nEmployee ID: " + emp6.employeeId()
				+ "-----No longer with CNN");

		System.out.println("\nNotice!!!");
		System.out.println(".........");
		// static method and final field implemented
		EmployeeInfo.holyDay();

		empinfo.printNotice();
		// private variable
		// empinfo.ssn;
	}


}
