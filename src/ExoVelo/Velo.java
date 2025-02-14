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
}

















