package tp3exosYaip6;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void greets() {
		System.out.println("Woof");
		
		
		
	}
	

	public void greets(Dog another) {
		System.out.println("Woooof");
		
	}
	
	public static void main(String[] args) 
	{
        Animal myCat = new Cat("skibidi");
        Dog myDog = new Dog("marge");
        BigDog myBigDog = new BigDog("marcus");

        myCat.greets(); 
        myDog.greets(); 

        myBigDog.greets(); 
        Dog anotherDog = new Dog("speed");
        myDog.greets(anotherDog);
        BigDog anotherBigDog = new BigDog("beast");
        myBigDog.greets(anotherDog); 
        myBigDog.greets(anotherBigDog); 
    }

}