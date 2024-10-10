package lab5;
abstract class Animal{
	protected int legs;
	Animal(int legs){this.legs=legs;}
	abstract void eat();
	void walk(){if(legs==0){System.out.println("This animal has no legs");}else{System.out.println("This animal walks by "+legs+" legs");}}
}
class Spider extends Animal{
	Spider(){super(8);}
	void eat(){System.out.println("Spider eats insects");}
}
interface Pets{
	void getName(String name);
	void setName(String name);
	void play();
}
class Cat extends Animal implements Pets{
	String name="";
	Cat(String name){super(4);this.name=name;}
	Cat(){this(" ");}
	public void getName(String name){System.out.println("This cat's name is "+name);}
	public void setName(String name){System.out.println("This cat's name is "+name);}
	public void play(){System.out.println("Cat plays with Rats");}
	void eat(){System.out.println("Cat eat fishes");}
}
class Fish extends Animal implements Pets{
	Fish(){super(0);}
	public void getName(String name){System.out.println("This fish's name is "+name);}
	public void setName(String name){System.out.println("This fish's name is "+name);}
	public void play(){}
	void eat(){System.out.println("Fish Eats plants");}
}
public class TestAnimals{
	public static void main(String args[]){
		Spider a=new Spider();
		System.out.println("Spider");
		a.eat();
		a.walk();
		Cat b=new Cat();
		System.out.println("\nCat");
		b.getName("Fluffy");
		b.walk();
		b.play();
		b.eat();
		b.setName("Moose");
		System.out.println("\nFish");
		Fish c=new Fish();
		c.getName("Mimi");
		c.walk();
		c.play();
		c.eat();
		c.setName("Momo");
	}
}
