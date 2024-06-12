package fundamentos.java;

public class Poliformismo {
	class Animal {
		  public void makeSound() {
		    System.out.println("Grr...");
		  }
		}
		class Cat extends Animal {
		  public void makeSound() {
		    System.out.println("Meow");
		  }
		}
		class Dog extends Animal {
		  public void makeSound() {
		    System.out.println("Woof");
		  }
		}
public static void main(String[] args) {
	Poliformismo p = new Poliformismo(); 
	Animal a = p.new Dog();
	Animal b = p.new Cat();
	
	a.makeSound();
	b.makeSound();
}
}
