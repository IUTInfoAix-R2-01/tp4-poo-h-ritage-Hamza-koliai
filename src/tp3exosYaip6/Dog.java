package tp3exosYaip6;

public class Dog extends Animal 
{

	public Dog(String name) 
	{
		super(name);
	}

	@Override
	public void greets() 
	{
		System.out.println("Woof");
		
		
		
	}
	

	public void greets(Dog another)
	{
		System.out.println("Woooof");
		
	}
	
	public static void main(String[] args) 
	{
        Animal myCat = new Cat("Salade");
        Dog myDog = new Dog("Tomate");
        BigDog myBigDog = new BigDog("Oignon");

        myCat.greets(); 
        myDog.greets(); 

        myBigDog.greets(); 
        Dog anotherDog = new Dog("Chef");
        myDog.greets(anotherDog);
        BigDog anotherBigDog = new BigDog("Sauce'algé");
        myBigDog.greets(anotherDog); 
        myBigDog.greets(anotherBigDog); 
    }

}