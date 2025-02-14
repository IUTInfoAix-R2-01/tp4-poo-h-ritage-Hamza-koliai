package tp3exosYaip4;

public class Mammal extends Animal
{
	public Mammal(String name)
	{
		super(name);
	}

	    @Override
	    public String toString() 
	    {
	        return "Cat: Cat [" + super.toString() + "]";
	    }
	    
	    public static void main(String[] args)
	    {
	        Mammal mammal = new Mammal("Squeezi");
	        System.out.println(mammal.toString());
	    }
	    
}