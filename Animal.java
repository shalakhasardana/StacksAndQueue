
public abstract class Animal {
	 String name;
	 int index=0;
	Animal(String name){
		this.name=name;
	}
	
	Animal(String name, int index){
		this.name=name;
		this.index=index;
	}
	
	Boolean isOlder(Animal animal) {
		return index>animal.index;
	}

}
