package tp3exosYaip6;

public abstract class Animal 
{
	
	private String name;
	
	
	public Animal(String name) 
	{
		this.name = name;
	}
	
	public abstract void greets();
	

	public static void main(String[] args) 
	{
        Animal myCat = new Cat("mabi");
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