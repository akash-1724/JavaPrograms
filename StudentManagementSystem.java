//Akash Ani 04
package Tutorial9;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String course;
    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}
class Hostler extends Student {
    String hostelName;

    Hostler(String name, int rollNo, String course, String hostelName) {
        super(name, rollNo, course);
        this.hostelName = hostelName;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Hostel Name: " + hostelName);
    }
}
class DayScholar extends Student {
    String busRoute;
    DayScholar(String name, int rollNo, String course, String busRoute) {
        super(name, rollNo, course);
        this.busRoute = busRoute;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bus Route: " + busRoute);
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course: ");
        String course = sc.nextLine();
        System.out.print("Hostler or DayScholar? (H/D): ");
        char type = sc.next().charAt(0);
        if (type == 'H' || type == 'h') {
            sc.nextLine();
            System.out.print("Enter hostel name: ");
            String hostelName = sc.nextLine();
            Hostler hostler = new Hostler(name, rollNo, course, hostelName);
            System.out.println("\nStudent Details:");
            hostler.displayDetails();
        } else if (type == 'D' || type == 'd') {
            sc.nextLine(); 
            System.out.print("Enter bus route: ");
            String busRoute = sc.nextLine();
            DayScholar dayScholar = new DayScholar(name, rollNo, course, busRoute);
            System.out.println("\nStudent Details:");
            dayScholar.displayDetails();
        } else {
            System.out.println("Invalid input!");
        }
        sc.close();
    }
}
