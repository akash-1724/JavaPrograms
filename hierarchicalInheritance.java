package Tutorial7;
import java.util.Scanner;
class Employeee {
	String name;
	int empID;
	void showEmp() {
		System.out.println("Name Of Employee :" + name);
		System.out.println("Employee ID :" + empID);
	}
}
class fullTimeEmp extends Employeee {
	int annualSal;
	void annSal() {
		System.out.println("Annual Salary :" + annualSal);
	}
}
class partTimeEmp extends Employeee {
	int hourlyRate;
	void hRate() {
		System.out.println("Hourly Rate :" + hourlyRate);
	}
}
public class hierarchicalInheritance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		fullTimeEmp o1 = new fullTimeEmp();
		System.out.println("Enter Details of the Full Time Employee :\n");
		System.out.println("Enter name :");
		o1.name = sc.nextLine();
		System.out.println("Enter Employee ID :");
		o1.empID = sc.nextInt();
		sc.nextLine(); // Consume the leftover newline character
		System.out.println("Enter Annual Salary :");
		o1.annualSal = sc.nextInt();
		sc.nextLine(); // Consume the leftover newline character
		
		partTimeEmp o2 = new partTimeEmp();
		System.out.println("Enter Details of the Part Time Employee :\n");
		System.out.println("Enter name :");
		o2.name = sc.nextLine();
		System.out.println("Enter Employee ID :");
		o2.empID = sc.nextInt();
		sc.nextLine(); // Consume the leftover newline character
		System.out.println("Enter Hourly Rate :");
		o2.hourlyRate = sc.nextInt();
		
		System.out.println("Details of the Full Time Employee :\n");
		o1.showEmp();
		o1.annSal();
		System.out.println("Details of the Part Time Employee :\n");
		o2.showEmp();
		o2.hRate();
		
		sc.close();
	}
}
