abstract class Animals {
	
	abstract void move();
	abstract void eat();
	void label() {
		System.out.println("information about animal:");
	}
}
class sparrow extends Animals {

void move() {
		 System.out.println("Moves by flying.");
     }
	void eat() {
		 System.out.println("Eats  worms.");
}	 
}

class Fish extends Animals {
		 void move() {
			 System.out.println("Moves by swimming.");
	     }
		 void eat() {
			 System.out.println("Eats seafood.");
		 }
}
class TestBird {
	public static void main(String[] args) {
		Animals mysparrow = new sparrow();

		mysparrow.label();
		mysparrow.move();
		mysparrow.eat();
	}
}

class TestFish {
	public static void main(String[] args) {
		Animals myFish = new Fish();

		myFish.label();
		myFish.move();
		myFish.eat();
	}
}