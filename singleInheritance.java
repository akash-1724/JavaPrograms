package Tutorial7;

import java.util.Scanner;

class Employee {
	String name;
	int empID;
}

class Manager extends Employee {
	String dept;
	void showEmp() {
		System.out.println("Name of Manager :" + name);
		System.out.println("Employee ID :" + empID);
		System.out.println("Department :" + dept);
	}
}

public class singleInheritance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Manager obj = new Manager();
		
		System.out.println("Enter the Name of the Manager :");
		obj.name = sc.nextLine();
		
		System.out.println("Enter the Employee ID :");
		obj.empID = sc.nextInt();
		sc.nextLine(); 
		
		System.out.println("Enter the Department :");
		obj.dept = sc.nextLine();
		
		obj.showEmp();
		sc.close();
	}
}


