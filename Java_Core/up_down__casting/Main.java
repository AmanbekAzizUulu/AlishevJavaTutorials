package up_down__casting;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.doEat();
		
		Dog doggo = new Dog();
		doggo.doBark();
		doggo.doEat();
		
		//Up_Casting
		Animal animal_1 = new Animal();
		Dog doggo_1 = new Dog();
		animal_1 = doggo_1;
		
		// или 
		
		Animal animal_2 = new Dog();
		
		//Down_Casting
		Animal animal_3 = new Dog();
		Dog doggo_2 = (Dog) animal_3;
		//не всегда безопасен
	}
}
