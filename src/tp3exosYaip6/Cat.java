package tp3exosYaip6;

public class Cat extends Animal 
{

    public Cat(String name) 
    {
        super(name); 
    }

    @Override
    public void greets() 
    {
        System.out.println("Meow");
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