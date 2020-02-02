class Dog implements FactoryAnimal {
	@Override
	public void speak() {
		System.out.println("<Barkkkkkkkkkkkkkk>");
	}
}

class Cat implements FactoryAnimal {
	@Override
	public void speak() {
		System.out.println("<Meowwwwwwwwwwwwww>");
	}
}

class Duck implements FactoryAnimal {
	@Override
	public void speak() {
		System.out.println("<Quackkkkkkkkkkkkk>");
	}
}

class Lion implements FactoryAnimal {
	@Override
	public void speak() {
		System.out.println("<Roarrrrrrrrrrrrrr>");
	}
}

class AnimalFactory {
	public FactoryAnimal getAnimal(String animal) {
		String animalUpper = animal.toUpperCase();
		switch (animalUpper) {
		case "DOG":
			return new Dog();
		case "CAT":
			return new Cat();
		case "DUCK":
			return new Duck();
		case "LION":
			return new Lion();
		default:
			return null;
		}
	}
}

public class FactoryDemo {
	public static void main(String[] args) {
		AnimalFactory zookeeper = new AnimalFactory();
		
		FactoryAnimal dog = zookeeper.getAnimal("DOG");
		FactoryAnimal cat = zookeeper.getAnimal("cat");
		FactoryAnimal duck = zookeeper.getAnimal("DuCk");
		FactoryAnimal lion = zookeeper.getAnimal("LIon");
		
		dog.speak();
		cat.speak();
		duck.speak();
		lion.speak();
	}
}
