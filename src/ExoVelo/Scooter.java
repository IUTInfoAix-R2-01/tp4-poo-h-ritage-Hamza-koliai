package ExoVelo;

public class Scooter extends Velo{

	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15;
	private double facteurPuissanceMoteur;
	
	public Scooter (double braquet, double diamRoue, double coupleMoteur)
	{
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public Scooter (double diamRoue, double coupleMoteur)
	{
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public Scooter()
	{
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15;
	}

	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() 
	{
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double dEFAUT_FACTEUR_PUISSANCE_MOTEUR) 
	{
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = dEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	public double getFacteurPuissanceMoteur() 
	{
		return facteurPuissanceMoteur;
	}
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) 
	{
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	@Override
	public String toString() 
	{
        return "Scooter [Facteur  puissance moteur =" + facteurPuissanceMoteur + "]";
	}
	
	@Override
	public double getPuissance(double  FrequenceCoupsDePedale)
	{
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
}
