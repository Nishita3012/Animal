package animal;

abstract class Animal {
	  abstract void makeSound();

	  public void eat() {
	    System.out.println("I can eat.");
	  }
	}

	class Dog extends Animal {
	  public void makeSound() {
	    System.out.println("Bark bark");
	  }
	}

	class Cat extends Animal {
		  public void makeSound() {
		    System.out.println("meow meow");
		  }
		}

	
	class Main {
	  public static void main(String[] args) {

	    // create an object of Dog class
	    Dog d1 = new Dog();
	    Cat d2 = new Cat();

	    d1.makeSound();
	    d2.makeSound();
	    d1.eat();
	  }
	}