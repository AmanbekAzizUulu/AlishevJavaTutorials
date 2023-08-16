package polymorphism;

public class Main {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		Dog dog = new Dog();
//		
//		animal.doEat();
//		dog.doEat();
		
//		Animal dog_1 = new Dog();
//		dog_1.doEat();//собака рассматривается как объект класса Animal
//		dog_1.doBark(); суперкласс Animal не имеет доступа к методам своих подклассов
//		
//		Dog dog_2 = new Dog();
//		dog_2.doBark();//собака рассматривается как объект класса Dog
//		dog_2.doEat();
//		
		Animal animal = new Animal();
		Dog doggo = new Dog();
		Cat kitty = new Cat();
		
		Main.test(animal);
		Main.test(doggo);
		Main.test(kitty);
	}
	
	public static void test(Animal animal) {
		animal.doEat();
	}

}
