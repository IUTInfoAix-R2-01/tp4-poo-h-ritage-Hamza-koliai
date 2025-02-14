package tp3exosYaip6;

public class BigDog extends Dog 
{
	
	public BigDog(String name) 
	{
		super(name);
	}
	
	public void greets() 
	{
		System.out.println("Woooooow");
	}
	
	public void greets(Dog another) 
	{
		System.out.println("Wooooooooow");
		
	}
	

	public void greets(BigDog another) 
	{
		System.out.println("Wooooooooooooooooooooow");
		
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