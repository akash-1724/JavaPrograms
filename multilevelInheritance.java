package Tutorial7;
import java.util.Scanner;

class Vehicle{
	String name;
	int year;
}
class Car extends Vehicle{
	int numOfDoors;
}
class ElectricCar extends Car{
	int batteryCapacity;
	void showCar() {
		System.out.println("Name of the Car :"+name);
		System.out.println("Year of Release :"+year);
		System.out.println("No.of Doors :"+numOfDoors);
		System.out.println("Battery Capacity :"+batteryCapacity+"maH");		
	}
}
public class multilevelInheritance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		ElectricCar obj=new ElectricCar();
		
		System.out.println("Enter the name of the Car :");
		obj.name=sc.nextLine();
		System.out.println("Enter the year of Release :");
		obj.year=sc.nextInt();
		System.out.println("Enter the no.of Doors :");
		obj.numOfDoors=sc.nextInt();
		System.out.println("Enter the Batter Capacity :");
		obj.batteryCapacity=sc.nextInt();
		sc.close();
		obj.showCar();		
	}
}
