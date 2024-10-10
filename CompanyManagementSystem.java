package Tutorial9;

import java.util.Scanner;

abstract class Employee {
 String name;
 String type;

 Employee(String name, String type) {
     this.name = name;
     this.type = type;
 }

 abstract double calculateMonthlySalary();

 String getName() {
     return name;
 }
}

class FullTimeEmployee extends Employee {
 double monthlySalary;
 final double HRA = 1000; 
 FullTimeEmployee(String name, double monthlySalary) {
     super(name, "FullTime");
     this.monthlySalary = monthlySalary;
 }

 double calculateMonthlySalary() {
     return monthlySalary + HRA;
 }
}

class PartTimeEmployee extends Employee {
 double hourlyWage;
 int hoursWorkedPerDay;
 final int workingDays = 25; 
 
 PartTimeEmployee(String name, double hourlyWage, int hoursWorkedPerDay) {
     super(name, "PartTime");
     this.hourlyWage = hourlyWage;
     this.hoursWorkedPerDay = hoursWorkedPerDay;
 }

 double calculateMonthlySalary() {
     return hourlyWage * hoursWorkedPerDay * workingDays;
 }
}

class Intern extends Employee {
 double stipend;

 Intern(String name, double stipend) {
     super(name, "Intern");
     this.stipend = stipend;
 }
 
 double calculateMonthlySalary() {
     return stipend;
 }
}

public class CompanyManagementSystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String continueInput;

     do {
         System.out.print("Enter employee's name: ");
         String name = sc.nextLine();

         System.out.print("Enter employee's job type (full-time, part-time, intern): ");
         String type = sc.nextLine().toLowerCase();

         Employee employee = null;

         switch (type) {
             case "full-time":
                 System.out.print("Enter the monthly salary: ");
                 double salary = sc.nextDouble();
                 employee = new FullTimeEmployee(name, salary);
                 break;

             case "part-time":
                 System.out.print("Enter hourly wage: ");
                 double hourlyWage = sc.nextDouble();
                 System.out.print("Enter number of hours worked/day: ");
                 int hoursWorked = sc.nextInt();
                 employee = new PartTimeEmployee(name, hourlyWage, hoursWorked);
                 break;

             case "intern":
                 System.out.print("Enter the stipend amount: ");
                 double stipend = sc.nextDouble();
                 employee = new Intern(name, stipend);
                 break;

             default:
                 System.out.println("Invalid job type entered!");
                 break;
         }

         if (employee != null) {
             System.out.println(employee.getName() + "'s Salary: Rs" + employee.calculateMonthlySalary());
         }

         sc.nextLine();
         

         System.out.print("Do you want to continue? (yes/no): ");
         continueInput = sc.nextLine();
     } while (continueInput.equalsIgnoreCase("yes"));

     sc.close();
 }
}
