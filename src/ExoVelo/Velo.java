package ExoVelo;
import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13;
	private double braquet ;
	private double diamRoue;
	private Random genAlea;
	
	public static double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	public static void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public Velo (double braquet, double diamRoue)
	{
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	public Velo (double braquet)
	{
		this.braquet = braquet;
	}
	
	public Velo()
	{
		DEFAUT_BRAQUET = 13;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoute) {
		this.diamRoue = diamRoute;
	}
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	@Override
	public String toString() 
	{
        return "Velo [braquet =" + braquet + ", diamRoue" + diamRoue + "]";
	}
	
	public double getPuissance(double  FrequenceCoupsDePedale)
	{
		return FrequenceCoupsDePedale *braquet* diamRoue * genAlea.nextDouble();
	}


public static void main(String[] args) {
    Random random = new Random();

    Velo veloClassique = new Velo();
    veloClassique.setBraquet(14.0);
    veloClassique.setDiamRoue(0.7);
    veloClassique.setGenAlea(random);

    double puissanceVelo = veloClassique.getPuissance(80); 
    System.out.println("Vélo Classique : " + veloClassique);
    System.out.println("Puissance Vélo Classique : " + puissanceVelo);

    Scooter  Scooter= new Scooter(14.0, 0.7, 20.0); 
    Scooter.setGenAlea(random);

    double puissanceScooter = Scooter.getPuissance(80);
    System.out.println("\nScooter : " + Scooter);
    System.out.println("Puissance Scooter : " + puissanceScooter);
	}
}
















