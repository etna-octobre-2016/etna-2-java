package taxonomy.species;

import taxonomy.families.BovidaeFamily;

public class Gazelle extends BovidaeFamily
{
	private String name;
    private static String scientificName = "Gazella";
    
    public Gazelle()
    {
    	this("Unknown");
    }

	public Gazelle(String name) {
		this.name = name;
	}

	@Override
	public void hide() 
	{
		System.out.println("You can't see me...");	
	}

	@Override
	public void Avoid() 
	{
		System.out.println("Je m'enfui mais avec grâce et élégance");		
	}

	@Override
	public void eat() 
	{	
		System.out.println("j'aime l'herbe fraiche");
	}

	@Override
	public void move() 
	{
		System.out.println("Déplacement avec grâce et élégance");
	}

	@Override
	public void reproduce() 
	{
		System.out.println("Un nouveau steak de Lion");
	}
	
	/* Getters */

    public String getScientificName() {
        return this.scientificName;
    }
    public String getName() {
        return this.name;
    }

    /* Setters */

    public void setName(String name) {
        this.name = name;
    }

}
