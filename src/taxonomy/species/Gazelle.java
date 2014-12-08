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
		System.out.println("I run away with grace and elegance");		
	}

	@Override
	public void eat() 
	{	
		System.out.println("I like the fresh grass");
	}

	@Override
	public void move() 
	{
		System.out.println("Travel with grace and elegance");
	}

	@Override
	public void reproduce() 
	{
		System.out.println("A new steak of Lion");
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
