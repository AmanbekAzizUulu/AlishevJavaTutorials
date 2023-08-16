package interfaces;

public class Main {
	public static void main (String args[]) {
		Animal animal_1 = new Animal(41212441);
		Person person_1 = new Person("Amanbek");
		
//		animal_1.sleep();
//		person_1.sayHello();
		
//		animal_1.showInfo();
//		person_1.showInfo();
		
		Info info_1 = new Animal(1241251);
		Info info_2 = new Person("Azamat");
		
//		info_1.showInfo();
//		info_2.showInfo(); //нельзя получить доступ к другим методам
						   //реализованным в данных классах при создании объекта 
						   //данным способом
		
		Main.outputInfo(info_1);
		Main.outputInfo(info_2);
		System.out.println("");
		
		Main.outputInfo(animal_1);
		Main.outputInfo(person_1);
	}
	
	public static void outputInfo(Info info) {
		info.showInfo();
	}
}
