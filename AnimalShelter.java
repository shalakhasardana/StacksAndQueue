import java.util.ArrayDeque;

public class AnimalShelter {
	int index=0;
	ArrayDeque<Cat> cats=new ArrayDeque<Cat>();
	ArrayDeque<Dog> dogs=new ArrayDeque<Dog>();
	public void enqueue(Animal animal) {
		animal.index++;
		if(animal instanceof Cat) {
			cats.add((Cat)animal);
		}
       if(animal instanceof Dog) {
    	   dogs.add((Dog)animal);
		}
		
	}
	public String dequeAny() {
	if(cats.isEmpty()) {
		return dogs.pop().name;
	}
	
	if(dogs.isEmpty()) {
		return cats.pop().name;
	}
	if((dogs.peek()).isOlder(cats.peek())){
		return cats.pop().name;
	}
	else
		return dogs.pop().name;
	}
	public Dog dequeDogs() {
		if(dogs.isEmpty()) {
			System.out.println("There are no dogs");
			return null;
		}
		return dogs.pop();
	}
	public Cat dequeCats() {
		if(cats.isEmpty()) {
			System.out.println("There are no cats");
			return null;
		}
		return cats.pop();
	}
	
	public int totalAnimals() {
		return cats.size()+dogs.size();
	}
	public void shelter() {
		System.out.println("Cats are");
		for(Cat cat:cats) {
			System.out.println(cat);
		}
		System.out.println("Dogs are");
		for(Dog dog:dogs) {
			System.out.println(dog);
		}
	}
	public static void main(String[] args) {
		Animal c1=new Cat("cat1");
		Animal c2=new Cat("cat2");
		Animal c3=new Cat("cat3");
		Animal c4=new Cat("cat4");
		Animal c5=new Cat("cat5");
		AnimalShelter obj=new AnimalShelter();
		obj.enqueue(c1);
		obj.enqueue(c2);
		obj.enqueue(c3);
		obj.enqueue(c4);
		obj.enqueue(c5);
		System.out.println(obj.dequeAny());
		System.out.println(obj.dequeCats());
		System.out.println(obj.dequeAny());
	}
	
}
